-- Crear la tabla EMPLOYEE
CREATE TABLE EMPLOYEE (
    Ssn CHAR(9) NOT NULL PRIMARY KEY,
    Fname VARCHAR(15) NOT NULL,
    Minit CHAR,
    Lname VARCHAR(15) NOT NULL,
    Bdate DATE,
    Address VARCHAR(30),
    Sex CHAR,
    Salary DECIMAL(10,2),
    Super_ssn CHAR(9),
    Dno INT NOT NULL
);

-- Crear la tabla DEPARTMENT
CREATE TABLE DEPARTMENT (
    Dnumber INT NOT NULL PRIMARY KEY,
    Dname VARCHAR(15) NOT NULL UNIQUE,
    Mgr_ssn CHAR(9) NOT NULL,
    Mgr_start_date DATE
);

-- Crear la tabla DEPT_LOCATIONS
CREATE TABLE DEPT_LOCATIONS (
    Dnumber INT NOT NULL,
    Dlocation VARCHAR(15) NOT NULL,
    PRIMARY KEY (Dnumber, Dlocation)
);

-- Crear la tabla PROJECT
CREATE TABLE PROJECT (
    Pnumber INT NOT NULL PRIMARY KEY,
    Pname VARCHAR(15) NOT NULL UNIQUE,
    Plocation VARCHAR(15) NOT NULL,
    Dnum INT NOT NULL
);

-- Crear la tabla WORKS_ON
CREATE TABLE WORKS_ON (
    Essn CHAR(9),
    Pno INT,
    Hours DECIMAL(3,1),
    PRIMARY KEY (Essn, Pno)
);

-- Crear la tabla DEPENDENT
CREATE TABLE DEPENDENT (
    Essn CHAR(9),
    Dependent_name VARCHAR(15),
    Sex CHAR,
    Bdate DATE,
    Relationship VARCHAR(8),
    PRIMARY KEY (Essn, Dependent_name)
);

-- Agregar las restricciones de clave foránea a las tablas
-- Alterar tabla EMPLOYEE para agregar restricciones de clave foránea
ALTER TABLE EMPLOYEE
ADD FOREIGN KEY (Super_ssn) REFERENCES EMPLOYEE(Ssn),
ADD FOREIGN KEY (Dno) REFERENCES DEPARTMENT(Dnumber);

-- Alterar tabla DEPARTMENT para agregar restricción de clave foránea
ALTER TABLE DEPARTMENT
ADD FOREIGN KEY (Mgr_ssn) REFERENCES EMPLOYEE(Ssn);

-- Alterar tabla DEPT_LOCATIONS para agregar restricción de clave foránea
ALTER TABLE DEPT_LOCATIONS
ADD FOREIGN KEY (Dnumber) REFERENCES DEPARTMENT(Dnumber);

-- Alterar tabla PROJECT para agregar restricción de clave foránea
ALTER TABLE PROJECT
ADD FOREIGN KEY (Dnum) REFERENCES DEPARTMENT(Dnumber);

-- Alterar tabla WORKS_ON para agregar restricciones de clave foránea
ALTER TABLE WORKS_ON
ADD FOREIGN KEY (Essn) REFERENCES EMPLOYEE(Ssn),
ADD FOREIGN KEY (Pno) REFERENCES PROJECT(Pnumber);

-- Alterar tabla DEPENDENT para agregar restricción de clave foránea
ALTER TABLE DEPENDENT
ADD FOREIGN KEY (Essn) REFERENCES EMPLOYEE(Ssn);
