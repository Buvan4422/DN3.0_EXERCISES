CREATE DEFINER=`root`@`localhost` PROCEDURE `UpdateSalary`(
    IN p_employee_id INT,
    IN p_percentage DECIMAL(5,2)
)
BEGIN
    DECLARE exit HANDLER FOR SQLEXCEPTION
    BEGIN
        INSERT INTO ErrorLog (ErrorMessage, ErrorTime)
        VALUES (CONCAT('Failed to update salary for employee ID ', p_employee_id), NOW());
    END;

    IF (SELECT COUNT(*) FROM Employees WHERE EmployeeID = p_employee_id) = 0 THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Employee ID does not exist';
    END IF;
    
    UPDATE Employees
    SET Salary = Salary * (1 + p_percentage / 100)
    WHERE EmployeeID = p_employee_id;

END