CREATE DATABASE IF NOT EXISTS mydatabase;

USE mydatabase;

CREATE TABLE IF NOT EXISTS students (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    course VARCHAR(50)
);

INSERT INTO students (id, name, course)
VALUES
(101, 'Ravi', 'Java'),
(102, 'Sita', 'Python'),
(103, 'Kiran', 'C++');

SELECT * FROM students;
