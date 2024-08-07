-- Active: 1723056525913@@127.0.0.1@3306

USE pl_sql;

CREATE TABLE Customers (
    CustomerID int PRIMARY KEY,
    Name varchar(100),
    DOB DATE,
    Balance int,
    LastModified DATE
);

CREATE TABLE Accounts (
    AccountID int PRIMARY KEY,
    CustomerID int,
    AccountType varchar(20),
    Balance int,
    LastModified DATE,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

CREATE TABLE Transactions (
    TransactionID int PRIMARY KEY,
    AccountID int,
    TransactionDate DATE,
    Amount int,
    TransactionType varchar(10),
    FOREIGN KEY (AccountID) REFERENCES Accounts(AccountID)
);

CREATE TABLE Loans (
    LoanID int PRIMARY KEY,
    CustomerID int,
    LoanAmount int,
    InterestRate int,
    StartDate DATE,
    EndDate DATE,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

CREATE TABLE Employees (
    EmployeeID int PRIMARY KEY,
    Name varchar(100),
    Position varchar(50),
    Salary int,
    Department varchar(50),
    HireDate DATE
); 



-- Insert into Customers
INSERT INTO customers (CustomerID, Name, DOB, Balance, LastModified)
VALUES (1, 'John Doe', '1985-05-15', 1000, NOW());

INSERT INTO customers (CustomerID, Name, DOB, Balance, LastModified)
VALUES (2, 'Jane Smith', '1990-07-20', 1500, NOW());

-- Insert into Accounts
INSERT INTO accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
VALUES (1, 1, 'Savings', 1000, NOW());

INSERT INTO accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
VALUES (2, 2, 'Checking', 1500, NOW());

-- Insert into Transactions
INSERT INTO transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType)
VALUES (1, 1, '2024-08-07', 200, 'Deposit');

INSERT INTO transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType)
VALUES (2, 2, '2024-08-07', 300, 'Withdrawal');

-- Insert into Loans
INSERT INTO loans (LoanID, CustomerID, LoanAmount, InterestRate, StartDate, EndDate)
VALUES (1, 1, 5000, 5, NOW(), DATE_ADD(NOW(), INTERVAL 60 MONTH));

-- Insert into Employees
INSERT INTO employees (EmployeeID, Name, Position, Salary, Department, HireDate)
VALUES (1, 'Alice Johnson', 'Manager', 70000, 'HR', '2015-06-15');

INSERT INTO employees (EmployeeID, Name, Position, Salary, Department, HireDate)
VALUES (2, 'Bob Brown', 'Developer', 60000, 'IT', '2017-03-20');


select * from customers;
select * from accounts;
select * from loans;
select * from transactions;
select * from employees;
