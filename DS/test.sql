/*========================================================
  Institute of Computer Technology
  Ganpat University
  (2CSE301) DATABASE MANAGEMENT SYSTEM
  PRACTICAL 15 - MySQL User Management and Privileges
  Student: Vivek Garai
  Enrolment Number: 25162201094

  Assumed sample database: northwind
  Run administrator sections using an account with CREATE USER,
  GRANT, REVOKE and access to mysql.user.

  IMPORTANT:
  The two ALTER TABLE statements must be run while connected as
  the respective newly created users to verify their ALTER privilege.
  This is split into sections because a MySQL SQL script cannot switch
  the authenticated account in the middle of the same connection.
========================================================*/

/*========================================================
  Q1. CREATE A USER WITH YOUR NAME
  Administrator session
========================================================*/

CREATE USER IF NOT EXISTS 'vivek'@'localhost'
IDENTIFIED BY 'Vivek@P15_2026';

/*========================================================
  Q2. DISPLAY ALL MYSQL USERS
  MySQL accounts are server-level users, not database rows.
========================================================*/

SELECT User, Host
FROM mysql.user
ORDER BY User, Host;

/*========================================================
  Q3. DISPLAY PRIVILEGES OF THE FIRST USER
========================================================*/

SHOW GRANTS FOR 'vivek'@'localhost';

/*========================================================
  Q4. GRANT PRIVILEGE TO REMOVE OrderDate FROM orders
  Administrator session: grant ALTER on this table.
========================================================*/

GRANT ALTER, CREATE, INSERT ON northwind.orders TO 'vivek'@'localhost';

SHOW GRANTS FOR 'vivek'@'localhost';

/*
  NEXT: Disconnect from the administrator session and connect as:
      User: vivek
      Host: localhost
      Password: Vivek@P15_2026

  Run this statement while logged in as vivek:

  USE northwind;
  ALTER TABLE orders DROP COLUMN OrderDate;
*/

/*========================================================
  Q5. VERIFY AND REVOKE ALL PRIVILEGES FROM THE FIRST USER
  Run as administrator after the ALTER TABLE command above.
========================================================*/

SHOW GRANTS FOR 'vivek'@'localhost';

REVOKE ALL PRIVILEGES, GRANT OPTION FROM 'vivek'@'localhost';

SHOW GRANTS FOR 'vivek'@'localhost';

/*========================================================
  Q6. CREATE A SECOND USER: NAME_BRANCH
  Here the branch suffix is AIML.
========================================================*/

CREATE USER IF NOT EXISTS 'vivek_aiml'@'localhost'
IDENTIFIED BY 'Vivek@AIML15_2026';

/*========================================================
  Q7. GRANT PRIVILEGE AND REMOVE ContactTitle FROM suppliers
========================================================*/

GRANT ALTER, CREATE, INSERT ON northwind.suppliers TO 'vivek_aiml'@'localhost';

SHOW GRANTS FOR 'vivek_aiml'@'localhost';

/*
  NEXT: Disconnect from the administrator session and connect as:
      User: vivek_aiml
      Host: localhost
      Password: Vivek@AIML15_2026

  Run these statements while logged in as vivek_aiml:

  USE northwind;
  ALTER TABLE suppliers DROP COLUMN ContactTitle;
*/

/*========================================================
  Q8. REVOKE ALL PRIVILEGES FROM BOTH USERS
  Run as administrator after the second user's ALTER statement.
========================================================*/

SHOW GRANTS FOR 'vivek'@'localhost';
SHOW GRANTS FOR 'vivek_aiml'@'localhost';

REVOKE ALL PRIVILEGES, GRANT OPTION FROM 'vivek'@'localhost';
REVOKE ALL PRIVILEGES, GRANT OPTION FROM 'vivek_aiml'@'localhost';

SHOW GRANTS FOR 'vivek'@'localhost';
SHOW GRANTS FOR 'vivek_aiml'@'localhost';

/*========================================================
  END OF PRACTICAL 15
========================================================*/
