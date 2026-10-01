/*========================================================
  Institute of Computer Technology
  Ganpat University
  B.Tech. CSE (CBA/BDA/CS/CSE)

  (2CSE301) DATABASE MANAGEMENT SYSTEM
  PRACTICAL 11 - STORED FUNCTION
========================================================*/


/*========================================================
  CREATE DATABASE
========================================================*/

DROP DATABASE IF EXISTS p11;
CREATE DATABASE p11;

USE p11;


/*========================================================
  CREATE STUDENT TABLE
========================================================*/

CREATE TABLE student
(
    rollno INT PRIMARY KEY,
    name VARCHAR(50),
    branch VARCHAR(20),
    marks1 INT,
    marks2 INT,
    marks3 INT,
    marks4 INT,
    marks5 INT
);


/*========================================================
  INSERT SAMPLE DATA
========================================================*/

INSERT INTO student
VALUES
(101, 'Vivek Garai', 'CSE', 92, 88, 95, 90, 91),
(102, 'Rahul Shah', 'CSE', 78, 82, 75, 80, 79),
(103, 'Amit Patel', 'BDA', 65, 70, 68, 72, 67),
(104, 'Neha Patel', 'CSE', 55, 60, 58, 62, 57),
(105, 'Priya Shah', 'CBA', 85, 87, 82, 89, 90),
(106, 'Karan Mehta', 'BDA', 45, 50, 48, 52, 46),
(107, 'Riya Joshi', 'CS', 95, 93, 91, 96, 94),
(108, 'Jay Patel', 'CSE', 35, 42, 38, 40, 36),
(109, 'Pooja Shah', 'CBA', 72, 75, 70, 74, 76),
(110, 'Arjun Mehta', 'CS', 81, 84, 86, 80, 83);


/*========================================================
  CHECK STUDENT TABLE
========================================================*/

SELECT * FROM student;


/*========================================================
  REMOVE OLD FUNCTIONS
========================================================*/

DROP FUNCTION IF EXISTS findmax;
DROP FUNCTION IF EXISTS findgrade;
DROP FUNCTION IF EXISTS findpercentage;
DROP FUNCTION IF EXISTS countstudent;
DROP FUNCTION IF EXISTS yesterdaydate;
DROP FUNCTION IF EXISTS tomorrowdate;
DROP FUNCTION IF EXISTS daysbetween;
DROP FUNCTION IF EXISTS daysfrombirth;
DROP FUNCTION IF EXISTS calculateage;


/*========================================================
  1. FUNCTION findmax()
     Returns maximum of two numbers
========================================================*/

DELIMITER //

CREATE FUNCTION findmax(a INT, b INT)
RETURNS INT
DETERMINISTIC
BEGIN
    IF a > b THEN
        RETURN a;
    ELSE
        RETURN b;
    END IF;
END //

DELIMITER ;

-- Test
SELECT findmax(25, 40) AS maximum;


/*========================================================
  2. FUNCTION findgrade()
     Calculates grade from marks
========================================================*/

DELIMITER //

CREATE FUNCTION findgrade(marks INT)
RETURNS VARCHAR(2)
DETERMINISTIC
BEGIN

    IF marks >= 90 THEN
        RETURN 'A+';

    ELSEIF marks >= 80 THEN
        RETURN 'A';

    ELSEIF marks >= 70 THEN
        RETURN 'B+';

    ELSEIF marks >= 60 THEN
        RETURN 'B';

    ELSEIF marks >= 50 THEN
        RETURN 'C+';

    ELSEIF marks >= 40 THEN
        RETURN 'C';

    ELSE
        RETURN 'F';
    END IF;

END //

DELIMITER ;

-- Test
SELECT
    95 AS marks,
    findgrade(95) AS grade;


/*========================================================
  3. FUNCTION findpercentage()
     Returns percentage of student based on roll number
========================================================*/

DELIMITER //

CREATE FUNCTION findpercentage(p_rollno INT)
RETURNS DECIMAL(5,2)
DETERMINISTIC
BEGIN
    DECLARE percentage DECIMAL(5,2);

    SELECT
        (marks1 + marks2 + marks3 + marks4 + marks5) / 5
    INTO percentage
    FROM student
    WHERE rollno = p_rollno;

    RETURN percentage;
END //

DELIMITER ;

-- Test
SELECT
    rollno,
    name,
    findpercentage(101) AS percentage
FROM student
WHERE rollno = 101;


/*========================================================
  4. FUNCTION countstudent()
     Returns number of students based on branch
========================================================*/

DELIMITER //

CREATE FUNCTION countstudent(p_branch VARCHAR(20))
RETURNS INT
DETERMINISTIC
BEGIN
    DECLARE total INT;

    SELECT COUNT(*)
    INTO total
    FROM student
    WHERE branch = p_branch;

    RETURN total;
END //

DELIMITER ;

-- Test
SELECT countstudent('CSE') AS total_students;


/*========================================================
  5. FUNCTION yesterdaydate()
     Returns yesterday's date
========================================================*/

DELIMITER //

CREATE FUNCTION yesterdaydate()
RETURNS DATE
DETERMINISTIC
BEGIN
    RETURN CURDATE() - INTERVAL 1 DAY;
END //

DELIMITER ;

-- Test
SELECT yesterdaydate() AS yesterday;


/*========================================================
  6. FUNCTION tomorrowdate()
     Returns tomorrow's date
========================================================*/

DELIMITER //

CREATE FUNCTION tomorrowdate()
RETURNS DATE
DETERMINISTIC
BEGIN
    RETURN CURDATE() + INTERVAL 1 DAY;
END //

DELIMITER ;

-- Test
SELECT tomorrowdate() AS tomorrow;


/*========================================================
  7. FUNCTION daysbetween()
     Returns number of days between two dates
========================================================*/

DELIMITER //

CREATE FUNCTION daysbetween(date1 DATE, date2 DATE)
RETURNS INT
DETERMINISTIC
BEGIN
    RETURN ABS(DATEDIFF(date1, date2));
END //

DELIMITER ;

-- Test
SELECT daysbetween('2026-09-01', '2026-09-18') AS total_days;


/*========================================================
  8. FUNCTION daysfrombirth()
     Returns number of days between today and birth date
========================================================*/

DELIMITER //

CREATE FUNCTION daysfrombirth()
RETURNS INT
DETERMINISTIC
BEGIN
    RETURN DATEDIFF(CURDATE(), '2006-01-15');
END //

DELIMITER ;

-- Test
SELECT daysfrombirth() AS days_from_birth;


/*========================================================
  9. FUNCTION calculateage()
     Calculates age from date of birth
========================================================*/

DELIMITER //

CREATE FUNCTION calculateage(dob DATE)
RETURNS INT
DETERMINISTIC
BEGIN
    RETURN TIMESTAMPDIFF(YEAR, dob, CURDATE());
END //

DELIMITER ;

-- Test
SELECT
    '2006-01-15' AS date_of_birth,
    calculateage('2006-01-15') AS age;


/*========================================================
  ADDITIONAL VERIFICATION
========================================================*/

/* Display all student percentages */
SELECT
    rollno,
    name,
    branch,
    findpercentage(rollno) AS percentage
FROM student;


/* Display student count for each branch */
SELECT
    branch,
    countstudent(branch) AS total_students
FROM student
GROUP BY branch;


/* Display grades for sample marks */
SELECT
    95 AS marks,
    findgrade(95) AS grade
UNION ALL
SELECT
    85,
    findgrade(85)
UNION ALL
SELECT
    75,
    findgrade(75)
UNION ALL
SELECT
    65,
    findgrade(65)
UNION ALL
SELECT
    55,
    findgrade(55)
UNION ALL
SELECT
    45,
    findgrade(45)
UNION ALL
SELECT
    35,
    findgrade(35);


/* Show all functions in p11 */
SHOW FUNCTION STATUS
WHERE Db = 'p11';


/*========================================================
  END OF PRACTICAL 11
========================================================*/