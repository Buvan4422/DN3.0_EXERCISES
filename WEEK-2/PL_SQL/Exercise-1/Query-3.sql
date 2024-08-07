-- Active: 1723056525913@@127.0.0.1@3306@pl_sql
CREATE DEFINER=`root`@`localhost` PROCEDURE `SendLoanReminders`()
BEGIN
    DECLARE done INT DEFAULT FALSE;
    DECLARE customer_name VARCHAR(255);
    DECLARE loan_amount DECIMAL(10, 2);
    DECLARE end_date DATE;
    DECLARE cur CURSOR FOR 
        SELECT c.Name, l.LoanAmount, l.EndDate
        FROM Loans l
        JOIN Customers c ON l.CustomerID = c.CustomerID
        WHERE l.EndDate BETWEEN CURDATE() AND CURDATE() + INTERVAL 30 DAY;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;

    OPEN cur;

    read_loop: LOOP
        FETCH cur INTO customer_name, loan_amount, end_date;
        IF done THEN
            LEAVE read_loop;
        END IF;

        -- Print reminder message
        SELECT CONCAT('Reminder: Loan for customer ', customer_name, 
                      ' with amount $', loan_amount,
                      ' is due on ', DATE_FORMAT(end_date, '%Y-%m-%d')) AS ReminderMessage;
    END LOOP;

    CLOSE cur;
END