CREATE DEFINER=`root`@`localhost` PROCEDURE `AddNewCustomer`(
    IN p_customer_id INT,
    IN p_name VARCHAR(255),
    IN p_dob DATE,
    IN p_balance DECIMAL(10,2)
)
BEGIN
    DECLARE exit HANDLER FOR SQLEXCEPTION
    BEGIN

        INSERT INTO ErrorLog (ErrorMessage, ErrorTime)
        VALUES (CONCAT('Failed to add new customer with ID ', p_customer_id), NOW());
    END;


    IF (SELECT COUNT(*) FROM Customers WHERE CustomerID = p_customer_id) > 0 THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Customer ID already exists';
    END IF;


    INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
    VALUES (p_customer_id, p_name, p_dob, p_balance, NOW());

END