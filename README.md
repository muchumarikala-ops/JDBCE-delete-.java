# JDBC Delete Program

## Aim
To write a Java program to connect to a MySQL database using JDBC and delete a record from a table.

## Program Name
JDBC Delete Example

## Technologies Used
- Java
- JDBC
- MySQL
- MySQL Connector/J

## Files
- `JDBCDeleteExample.java` — Java source code
- `database.sql` — Database setup and sample records
- `README.md` — Project documentation

## Database Details
- Database: `mydatabase`
- Table: `students`
- Columns: `id`, `name`, `course`

## Concepts Used
- JDBC Connection
- PreparedStatement
- DELETE SQL statement
- executeUpdate()
- Exception handling

## Procedure
1. Create the database and students table.
2. Insert sample student records.
3. Configure the MySQL username and password.
4. Add the MySQL JDBC driver to the project.
5. Execute the Java program.
6. The program deletes the student record with ID 101.

## Expected Output
Student record deleted successfully.
Rows deleted: 1

## Result
The Java program demonstrates deleting a record from a MySQL database using JDBC.
