CREATE DEFINER=`root`@`localhost` FUNCTION `HasSufficientBalance`(
    p_account_id INT, 
    p_amount DECIMAL(10, 2)
) RETURNS tinyint(1)
    DETERMINISTIC
BEGIN
    DECLARE current_balance DECIMAL(10, 2);

    SELECT Balance INTO current_balance
    FROM Accounts
    WHERE AccountID = p_account_id;

    IF current_balance >= p_amount THEN
        RETURN TRUE;
    ELSE
        RETURN FALSE;
    END IF;
END