CREATE DEFINER=`root`@`localhost` PROCEDURE `AccountOperations_CloseAccount`(p_AccountID INT)
BEGIN
    DELETE FROM Accounts
    WHERE AccountID = p_AccountID;
END