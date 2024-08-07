CREATE DEFINER=`root`@`localhost` PROCEDURE `ApplyAnnualFee`(p_fee DECIMAL(10, 2))
BEGIN
    DECLARE done INT DEFAULT FALSE;
    DECLARE cur_account_id INT;
    DECLARE cur_balance DECIMAL(10, 2);

    DECLARE cur1 CURSOR FOR 
        SELECT AccountID, Balance 
        FROM Accounts;

    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;

    OPEN cur1;

    read_loop: LOOP
        FETCH cur1 INTO cur_account_id, cur_balance;
        IF done THEN
            LEAVE read_loop;
        END IF;


        SET cur_balance = cur_balance - p_fee;


        UPDATE Accounts
        SET Balance = cur_balance
        WHERE AccountID = cur_account_id;
    END LOOP;

    CLOSE cur1;
    COMMIT;
END