show databases;
use mysql;
show tables;
Select * from mysql.wipro;

delimiter $$
create procedure getdetail ()
Begin
Select * from wipro ;
End
delimiter ;

call getdetail() ;


DELIMITER $$
CREATE PROCEDURE getdetailWithId (
    IN idVal INT,
    OUT empname VARCHAR(255)
)
BEGIN
    -- Selecting empname into the OUT parameter
    SELECT name INTO wipro FROM wipro WHERE Id = idVal limit 1;
END $$
DELIMITER ;

CALL getdetailWithId(100,@empname);


DELIMITER // 
CREATE PROCEDURE GetWiproById(IN input_id INT) 
BEGIN 
SELECT Name, Id FROM wipro WHERE Id = input_id; 
END // DELIMITER ;

call GetWiproById(1);



DELIMITER //
CREATE PROCEDURE GETDETAILS(IN input_id INT, OUT output_name VARCHAR(255))
BEGIN
    -- Retrieve the Name for the provided ID
    SELECT Name INTO output_name
    FROM wipro
    WHERE Id = input_id;
END //
DELIMITER ;

-- Declare a variable to hold the output
SET @output_name = 'Raju Kumar';


-- Call the stored procedure with input ID and output variable
CALL GETDETAILS(100, @output_name);


-- Retrieve the output result
SELECT @output_name;


