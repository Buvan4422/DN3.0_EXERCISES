CREATE DEFINER=`root`@`localhost` PROCEDURE `UpdateLoanInterestRates`(p_new_interest_rate DECIMAL(5, 2))
BEGIN
    DECLARE done INT DEFAULT FALSE;
    DECLARE cur_loan_id INT;
    DECLARE cur_interest_rate DECIMAL(5, 2);

    DECLARE cur1 CURSOR FOR 
        SELECT LoanID, InterestRate 
        FROM Loans;

    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;

    OPEN cur1;

    read_loop: LOOP
        FETCH cur1 INTO cur_loan_id, cur_interest_rate;
        IF done THEN
            LEAVE read_loop;
        END IF;

        SET cur_interest_rate = p_new_interest_rate;

        UPDATE Loans
        SET InterestRate = cur_interest_rate
        WHERE LoanID = cur_loan_id;
    END LOOP;

    CLOSE cur1;
    COMMIT;
END