SELECT SYSTIMESTAMP FROM DUAL;

SELECT TO_CHAR(SYSDATE, 'DD-MON-YYYY HH:MI:SS') FROM dual;

SELECT TO_CHAR(SYSDATE, 'DD-MM-YYYY') FROM dual;

SELECT TO_CHAR(sysdate,'Day') FROM dual;

SELECT TO_CHAR(SYSDATE+10, 'DD-MM-YYYY') FROM dual;

create table Employee(
EmpFName VARCHAR(10),
EmpMName VARCHAR(10),
EmpLastName VARCHAR(10),
EmpAge INT CHECK(EmpAge<50 AND EmpAge>0),
EmpCity VARCHAR(10) check(Empcity like 'B%') ,
EmpDesignation VARCHAR(10) check(EmpDesignation like '%manager') ,
EmpId VARCHAR(10)  PRIMARY KEY  check(EmpId like'emp__'),
empDOB DATE
);

INSERT INTO Employee VALUES ('sumanth',' ','dhulipalla',21,'Bangalore','s manager','emp09','09-sep-1998');
INSERT INTO Employee VALUES ('sumanth',' a ','dhulipalla',21,'Bangalore','a manager','emp01','09-sep-1998');
INSERT INTO Employee VALUES ('sumanth',' b ','dhulipalla',21,'Bangalore','b manager','emp02','09-sep-1998');
INSERT INTO Employee VALUES ('sumanth',' c ','dhulipalla',21,'Bangalore','c manager','emp03','09-sep-1998');
INSERT INTO Employee VALUES ('sumanth',' d ','dhulipalla',21,'Bangalore','d manager','emp04','09-sep-1998');

UPDATE   Employee
SET EmpAge = 40  
WHERE EmpId ='emp03' ;  

SELECT * FROM employee;

COMMIT;

delete from Employee where EmpId='emp02';

alter session set recyclebin = on;

drop table Employee;

FLASHBACK TABLE Employee TO BEFORE DROP;

select TO_CHAR(empDOB,'DD-MM-YYYY') from Employee;

SELECT( SUBSTR(EmpFName,1,1)||'.'||SUBSTR(EmpMName,1,2)||'.'||EmpLastName)  FROM Employee;


create procedure prcOutDemo(abc out varchar2)
as
begin
abc:='hello from proc';
end;


declare
xyz varchar2(20);
begin
prcoutDemo(xyz);
dbms_output.put_line(xyz);
end;

create or replace procedure prcOutDemo(dollar number,rupees out number)
as
begin
rupees:=dollar*70;
end;



CREATE OR REPLACE PROCEDURE DATEBACK6(OUTDATE DATE,INDATE DATE) 
AS
BEGIN
OUTDATE:= INDATE-10;
END;

SET SERVEROUTPUT ON

declare
OUTDAT DATE;
begin
DATEBACK6(OUTDAT,SYSDATE);
dbms_output.put_line(OUTDAT);
end;