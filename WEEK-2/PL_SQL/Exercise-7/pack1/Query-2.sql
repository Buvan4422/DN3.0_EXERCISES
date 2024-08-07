CREATE DEFINER=`root`@`localhost` PROCEDURE `CustomerManagement_UpdateCustomer`(
    IN p_CustomerID INT,
    IN p_Name VARCHAR(255),
    IN p_DOB DATE,
    IN p_Balance DECIMAL(10, 2)
)
BEGIN
    UPDATE Customers
    SET Name = p_Name, DOB = p_DOB, Balance = p_Balance, LastModified = CURDATE()
    WHERE CustomerID = p_CustomerID;
END