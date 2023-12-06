package org.perscholas.springboot.service;

import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.EmployeeDAO;
import org.perscholas.springboot.database.entity.Employee;
import org.perscholas.springboot.form.CreateEmployeeFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmployeeService {

    @Autowired
    private EmployeeDAO employeeDao;

    public Employee createEmployee(CreateEmployeeFormBean form) {
        log.debug("id: " + form.getId());
        log.debug("firstName: " + form.getFirstName());
        log.info("lastName: " + form.getLastName());
        log.info("phone: " + form.getDepartmentName());

        Employee employee = employeeDao.findById(form.getId());

        if ( employee == null ) {
            employee = new Employee();

        }

        employee.setFirstName(form.getFirstName());
        employee.setLastName(form.getLastName());
        employee.setDepartmentName(form.getDepartmentName());

        return employeeDao.save(employee);
    }
}
