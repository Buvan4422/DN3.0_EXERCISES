DELIMITER //

CREATE TRIGGER CheckTransactionRules
BEFORE INSERT ON Transactions
FOR EACH ROW
BEGIN
    DECLARE current_balance DECIMAL(10, 2);

    -- Get the current balance of the account
    SELECT Balance INTO current_balance
    FROM Accounts
    WHERE AccountID = NEW.AccountID;

    -- Ensure deposits are positive
    IF NEW.TransactionType = 'Deposit' AND NEW.Amount <= 0 THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Deposit amount must be positive';
    END IF;

    -- Ensure withdrawals do not exceed the balance
    IF NEW.TransactionType = 'Withdrawal' AND NEW.Amount > current_balance THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Insufficient balance for withdrawal';
    END IF;
END //

DELIMITER ;
