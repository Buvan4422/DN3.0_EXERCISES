CREATE DEFINER=`root`@`localhost` FUNCTION `CalculateAge`(p_dob DATE) RETURNS int
    DETERMINISTIC
BEGIN
    DECLARE age INT;
    SET age = TIMESTAMPDIFF(YEAR, p_dob, CURDATE());
    RETURN age;
END