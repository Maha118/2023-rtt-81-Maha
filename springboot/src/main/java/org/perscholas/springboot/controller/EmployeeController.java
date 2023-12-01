package org.perscholas.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.EmployeeDAO;
import org.perscholas.springboot.database.entity.Employee;
import org.perscholas.springboot.form.CreateEmployeeFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @GetMapping("/employee/create")
    public ModelAndView createEmployee() {
        ModelAndView response = new ModelAndView("employee/create");

        log.info(" In create employee with no Args");
        return response;
    }


    @GetMapping("/employee/createSubmit")
    public ModelAndView createEmployee(CreateEmployeeFormBean form) {
        ModelAndView response = new ModelAndView("employee/create");

        log.info("firstname:" + form.getFirst_Name());
        log.info("lastname:" + form.getLast_Name());
        log.info("department:" + form.getDepartment_Name());


        Employee employee = new Employee();

        employee.setFirst_Name(form.getFirst_Name());
        employee.setLast_Name(form.getLast_Name());
        employee.setDepartment_Name(form.getDepartment_Name());


        //  customerDAO.save(customer);
        employeeDAO.save(employee);

        log.info(" In create customer with  Args");
        return response;
    }
}