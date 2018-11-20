-- PL(PROGRAMMING LANGUAGE) BLOCK
-- Unnamed procedure
begin
    UPDATE LOCATIONS
    set city = 'Mumbai'
    where POSTAL_CODE = '400059';
end;

---------------------------------------------------------------
-- Named Procedure (Stored)
CREATE PROCEDURE update_locations AS
begin
    UPDATE LOCATIONS
    set city = 'Mumbai'
    where POSTAL_CODE = '400059';
end;
---------------------------------------------------------------

--Turn on output statements
set serveroutput on

-- Sample store procedure to display a message
begin 
    dbms_output.put_line('Hello World');
end;

---------------------------------------------------------------
--Turn off output statements
set serveroutput off

---------------------------------------------------------------
-- EXECUTE COMMAND
---------------------------------------------------------------
exec DBMS_OUTPUT.PUT_LINE('HELLO WORLD');
---------------------------------------------------------------
-- CALL COMMAND
---------------------------------------------------------------
CALL DBMS_OUTPUT.PUT_LINE('HELLO WORLD');
-- PL(PROGRAMMING LANGUAGE) BLOCK
-- Unnamed procedure
begin
    UPDATE LOCATIONS
    set city = 'Mumbai'
    where POSTAL_CODE = '400059';
end;

---------------------------------------------------------------
-- Named Procedure (Stored)
CREATE PROCEDURE update_locations AS
begin
    UPDATE LOCATIONS
    set city = 'Mumbai'
    where POSTAL_CODE = '400059';
end;
---------------------------------------------------------------

--Turn on output statements
set serveroutput on

-- Sample store procedure to display a message
begin 
    dbms_output.put_line('Hello World');
end;

---------------------------------------------------------------
-- create or replace procedure
---------------------------------------------------------------
CREATE OR REPLACE PROCEDURE update_locations AS
begin
    DBMS_OUTPUT.PUT_LINE('Updating table');
    UPDATE LOCATIONS
    set city = 'Mumbai'
    where POSTAL_CODE = '400059';
    DBMS_OUTPUT.PUT_LINE('Updated');
end;

------------------------------------------
--Calling Update_Locations procedure
------------------------------------------
Call update_locations()

------------------------------------------
--Execute Update_Locations procedure
------------------------------------------
EXEC update_locations()
