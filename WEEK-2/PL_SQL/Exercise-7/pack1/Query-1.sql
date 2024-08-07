CREATE DEFINER=`root`@`localhost` PROCEDURE `CustomerManagement_AddCustomer`(
    IN p_CustomerID INT,
    IN p_Name VARCHAR(255),
    IN p_DOB DATE,
    IN p_Balance DECIMAL(10, 2)
)
BEGIN
    INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
    VALUES (p_CustomerID, p_Name, p_DOB, p_Balance, CURDATE());
END