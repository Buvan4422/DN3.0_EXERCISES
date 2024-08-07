CREATE DEFINER=`root`@`localhost` PROCEDURE `TransferFunds`(
    IN p_from_account INT,
    IN p_to_account INT,
    IN p_amount DECIMAL(10, 2)
)
BEGIN
    DECLARE exit HANDLER FOR SQLEXCEPTION
    BEGIN
        ROLLBACK;
        INSERT INTO ErrorLog (ErrorMessage, ErrorTime)
        VALUES (CONCAT('Transfer failed from account ', p_from_account, ' to account ', p_to_account, ' for amount ', p_amount), NOW());
    END;

    START TRANSACTION;

    IF (SELECT Balance FROM Accounts WHERE AccountID = p_from_account) < p_amount THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Insufficient funds';
    END IF;


    UPDATE Accounts
    SET Balance = Balance - p_amount
    WHERE AccountID = p_from_account;

    UPDATE Accounts
    SET Balance = Balance + p_amount
    WHERE AccountID = p_to_account;

    COMMIT;
END