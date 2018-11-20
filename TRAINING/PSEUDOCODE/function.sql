CREATE OR REPLACE FUNCTION count_emp(DEPT NUMBER) RETURN 

NUMBER AS
    p_count number;
BEGIN
    SELECT count(*) into p_count from employees
    where department_id=dept;
    return p_count;
END;

SELECT department_name, count_emp(department_id) from departments;