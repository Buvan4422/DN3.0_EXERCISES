CREATE DEFINER=`root`@`localhost` FUNCTION `CalculateMonthlyInstallment`(
    p_loan_amount DECIMAL(10, 2), 
    p_interest_rate DECIMAL(5, 2), 
    p_loan_duration_years INT
) RETURNS decimal(10,2)
    DETERMINISTIC
BEGIN
    DECLARE monthly_rate DECIMAL(5, 4);
    DECLARE months INT;
    DECLARE monthly_installment DECIMAL(10, 2);

    SET monthly_rate = p_interest_rate / 100 / 12;
    SET months = p_loan_duration_years * 12;

    IF monthly_rate = 0 THEN
        SET monthly_installment = p_loan_amount / months;
    ELSE
        SET monthly_installment = p_loan_amount * (monthly_rate * POW(1 + monthly_rate, months)) / (POW(1 + monthly_rate, months) - 1);
    END IF;

    RETURN monthly_installment;
END