CREATE DEFINER=`root`@`localhost` FUNCTION `EmployeeManagement_CalculateAnnualSalary`(p_EmployeeID INT) RETURNS decimal(10,2)
    DETERMINISTIC
BEGIN
    DECLARE annual_salary DECIMAL(10, 2);
    
    SELECT Salary * 12 INTO annual_salary
    FROM Employees
    WHERE EmployeeID = p_EmployeeID;
    
    RETURN annual_salary;
END