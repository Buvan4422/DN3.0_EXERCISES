CREATE DEFINER=`root`@`localhost` FUNCTION `AccountOperations_GetTotalBalance`(p_CustomerID INT) RETURNS decimal(10,2)
    DETERMINISTIC
BEGIN
    DECLARE total_balance DECIMAL(10, 2);
    
    SELECT SUM(Balance) INTO total_balance
    FROM Accounts
    WHERE CustomerID = p_CustomerID;
    
    RETURN total_balance;
END