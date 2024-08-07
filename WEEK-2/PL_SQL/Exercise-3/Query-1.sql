CREATE DEFINER=`root`@`localhost` PROCEDURE `ProcessMonthlyInterest`()
BEGIN
    DECLARE done INT DEFAULT FALSE;
    DECLARE account_id INT;
    DECLARE current_balance DECIMAL(10, 2);
    DECLARE cur CURSOR FOR 
        SELECT AccountID, Balance 
        FROM Accounts 
        WHERE AccountType = 'Savings';
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;

    OPEN cur;

    read_loop: LOOP
        FETCH cur INTO account_id, current_balance;
        IF done THEN
            LEAVE read_loop;
        END IF;


        SET current_balance = current_balance * 1.01;


        UPDATE Accounts
        SET Balance = current_balance
        WHERE AccountID = account_id;
    END LOOP;

    CLOSE cur;
    COMMIT;
END