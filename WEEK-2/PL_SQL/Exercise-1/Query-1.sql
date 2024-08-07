CREATE DEFINER=`root`@`localhost` PROCEDURE `ApplyLoanDiscount`()
BEGIN
    DECLARE done INT DEFAULT FALSE;
    DECLARE customer_id INT;
    DECLARE dob DATE;
    DECLARE cur CURSOR FOR SELECT CustomerID, DOB FROM Customers;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;

    OPEN cur;

    read_loop: LOOP
        FETCH cur INTO customer_id, dob;
        IF done THEN
            LEAVE read_loop;
        END IF;

        -- Calculate age
        SET @age = TIMESTAMPDIFF(YEAR, dob, CURDATE());

        IF @age > 60 THEN
            -- Update loan interest rate for customers above 60
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = customer_id;
        END IF;
    END LOOP;

    CLOSE cur;
    COMMIT;
END