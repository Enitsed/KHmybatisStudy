select e.employee_id, e.first_name, e.job_id, e.department_id, d.department_name
from employees e, departments d
where e.department_id=d.department_id

select e.department_id, d.department_name, e.employee_id, e.first_name
from departments d, employees e
where d.department_id=e.department_id
order by d.department_id