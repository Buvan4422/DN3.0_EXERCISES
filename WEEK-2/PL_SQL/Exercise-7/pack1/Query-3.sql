CREATE DEFINER=`root`@`localhost` FUNCTION `CustomerManagement_GetCustomerBalance`(p_CustomerID INT) RETURNS decimal(10,2)
    DETERMINISTIC
BEGIN
    DECLARE balance DECIMAL(10, 2);
    
    SELECT Balance INTO balance
    FROM Customers
    WHERE CustomerID = p_CustomerID;
    
    RETURN balance;
END