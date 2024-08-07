CREATE DEFINER=`root`@`localhost` PROCEDURE `EmployeeManagement_HireEmployee`(
    IN p_EmployeeID INT,
    IN p_Name VARCHAR(255),
    IN p_Position VARCHAR(100),
    IN p_Salary DECIMAL(10, 2),
    IN p_Department VARCHAR(100),
    IN p_HireDate DATE
)
BEGIN
    INSERT INTO Employees (EmployeeID, Name, Position, Salary, Department, HireDate)
    VALUES (p_EmployeeID, p_Name, p_Position, p_Salary, p_Department, p_HireDate);
END