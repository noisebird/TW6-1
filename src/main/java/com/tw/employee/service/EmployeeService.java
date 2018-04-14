package com.tw.employee.service;

import com.tw.employee.dao.Employee;

import java.util.List;

/**
 * Created by wangjie on 2018/4/13.
 */
public interface EmployeeService {
    List<Employee> getAllEmployees();
    boolean addEmployee(Employee employee) ;
    boolean deleteEmployee(int id);
    Employee getEmployeeById(int id);
    boolean updateEmployee(Employee id);
}
