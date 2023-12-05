package org.perscholas.springboot.controller;

import io.micrometer.common.util.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.EmployeeDAO;
import org.perscholas.springboot.database.entity.Customer;
import org.perscholas.springboot.database.entity.Employee;
import org.perscholas.springboot.form.CreateEmployeeFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDAO employeeDAO;
    @GetMapping("/employee/search")
    public ModelAndView search(@RequestParam(required = false) String firstNameSearch,
                               @RequestParam(required = false) String lastNameSearch) {
        ModelAndView response = new ModelAndView("employee/search");

        log.debug("in the employee search controller method : first name = " + firstNameSearch + " last name = " + lastNameSearch);

        if (!StringUtils.isEmpty(firstNameSearch) || !StringUtils.isEmpty(lastNameSearch)) {

            response.addObject("firstNameSearch", firstNameSearch);
            response.addObject("lastNameSearch", lastNameSearch);

            if (!StringUtils.isEmpty(firstNameSearch)) {
                firstNameSearch = "%" + firstNameSearch + "%";
            }

            if (!StringUtils.isEmpty(lastNameSearch)) {
                lastNameSearch = "%" + lastNameSearch + "%";
            }

            // we only want to do this code if the user has entered either a first name or a last name
            List<Employee> employees = employeeDAO.findByFirstNameOrLastName(firstNameSearch, lastNameSearch);

            response.addObject("employeeVar", employees);


            for (Employee employee : employees) {
                log.debug("employee: id = " + employee.getId() + " last name = " + employee.getLastName());
            }
        }

        return response;
    }

    @GetMapping("/employee/create")
    public ModelAndView createEmployee() {
        ModelAndView response = new ModelAndView("employee/create");

        log.info("In create employee with no Args");
        return response;
    }


    @GetMapping("/employee/createSubmit")
    public ModelAndView createEmployeeSubmit(CreateEmployeeFormBean form) {
        ModelAndView response = new ModelAndView("employee/create");

        log.info("firstname:" + form.getFirstName());
        log.info("lastname:" + form.getLastName());
        log.info("departmentname:" + form.getDepartmentName());


        Employee employee = new Employee();

        employee.setFirstName(form.getFirstName());
        employee.setLastName(form.getLastName());
        employee.setDepartmentName(form.getDepartmentName());


        //  customerDAO.save(customer);
        employeeDAO.save(employee);

        log.info(" In create customer with  Args");
        return response;
    }
}