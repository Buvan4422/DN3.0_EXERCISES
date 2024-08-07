CREATE DEFINER=`root`@`localhost` PROCEDURE `UpdateEmployeeBonus`(
    IN p_department VARCHAR(255),
    IN bon_perc DECIMAL(5, 2)
)
BEGIN
    DECLARE done INT DEFAULT FALSE;
    DECLARE employee_id INT;
    DECLARE current_salary DECIMAL(10, 2);
    DECLARE cur CURSOR FOR 
        SELECT EmployeeID, Salary 
        FROM Employees 
        WHERE Department = p_department;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;

    OPEN cur;

    read_loop: LOOP
        FETCH cur INTO employee_id, current_salary;
        IF done THEN
            LEAVE read_loop;
        END IF;

        SET current_salary = current_salary * (1 + bon_perc / 100);

        UPDATE Employees
        SET Salary = current_salary
        WHERE EmployeeID = employee_id;
    END LOOP;

    CLOSE cur;
    COMMIT;
END