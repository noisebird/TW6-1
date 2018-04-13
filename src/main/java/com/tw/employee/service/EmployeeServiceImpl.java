package com.tw.employee.service;

import com.tw.employee.dao.Employee;
import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

import java.util.List;

/**
 * Created by wangjie on 2018/4/13.
 */
public class EmployeeServiceImpl implements EmployeeService {
    private List<Employee> list;
    private  JSONArray jsonArray =JSONArray.fromObject(employees);
    public static final String employees="[{'name':'张三','age':20,'id':1001,gender:'男''},"+
            "{'name':'王小花','age':18,'id':1002,gender:'女''},"+
            "{'name':'李小胖','age':25,'id':1003,gender:'男''},"+
            "{'name':'赵小颖','age':21,'id':1004,gender:'女''}]";

    public EmployeeServiceImpl() {
        this.list =JSONArray.toList(jsonArray, new Employee(), new JsonConfig());
    }
    @Override
    public List<Employee> getAllEmployees() {
        return list;
    }

    @Override
    public boolean addEmployee(Employee employee) {
        return false;
    }

    @Override
    public boolean deleteEmployee() {
        return false;
    }

    @Override
    public Employee getEmployeeById() {
        return null;
    }

    @Override
    public boolean updateEmployee() {
        return false;
    }
}
