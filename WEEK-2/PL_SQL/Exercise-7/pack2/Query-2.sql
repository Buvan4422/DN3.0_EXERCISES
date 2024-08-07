CREATE DEFINER=`root`@`localhost` PROCEDURE `EmployeeManagement_UpdateEmployee`(
    IN p_EmployeeID INT,
    IN p_Name VARCHAR(255),
    IN p_Position VARCHAR(100),
    IN p_Salary DECIMAL(10, 2),
    IN p_Department VARCHAR(100),
    IN p_HireDate DATE
)
BEGIN
    UPDATE Employees
    SET Name = p_Name, Position = p_Position, Salary = p_Salary, Department = p_Department, HireDate = p_HireDate
    WHERE EmployeeID = p_EmployeeID;
END