CREATE DEFINER=`root`@`localhost` PROCEDURE `AccountOperations_OpenAccount`(
    IN p_AccountID INT,
    IN p_CustomerID INT,
    IN p_AccountType VARCHAR(50),
    IN p_Balance DECIMAL(10, 2)
)
BEGIN
    INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
    VALUES (p_AccountID, p_CustomerID, p_AccountType, p_Balance, CURDATE());
END