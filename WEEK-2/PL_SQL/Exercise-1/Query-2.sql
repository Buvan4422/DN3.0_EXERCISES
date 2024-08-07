CREATE DEFINER=`root`@`localhost` PROCEDURE `SetVIPStatus`()
BEGIN
    DECLARE done INT DEFAULT FALSE;
    DECLARE customer_id INT;
    DECLARE balance DECIMAL(10, 2);
    DECLARE cur CURSOR FOR SELECT CustomerID, Balance FROM Customers;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;

    OPEN cur;

    read_loop: LOOP
        FETCH cur INTO customer_id, balance;
        IF done THEN
            LEAVE read_loop;
        END IF;

        IF balance > 10000 THEN
            -- Set IsVIP to TRUE for customers with a balance over $10,000
            UPDATE Customers
            SET IsVIP = TRUE
            WHERE CustomerID = customer_id;
        END IF;
    END LOOP;

    CLOSE cur;
    COMMIT;
END