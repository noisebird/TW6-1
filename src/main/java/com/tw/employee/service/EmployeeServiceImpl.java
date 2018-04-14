package com.tw.employee.service;
import com.tw.employee.dao.Employee;
import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wangjie on 2018/4/13.
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    private Map<Integer, Employee> map = new LinkedHashMap<Integer, Employee>();
    private JSONArray jsonArray = JSONArray.fromObject(employees);
    public static final String employees = "[{'name':'张三','age':20,'id':1001,gender:'男'}," +
            "{'name':'王小花','age':18,'id':1002,gender:'女'}," +
            "{'name':'李小胖','age':25,'id':1003,gender:'男'}," +
            "{'name':'赵小颖','age':21,'id':1004,gender:'女'}]";

    public EmployeeServiceImpl() {
        List<Employee> list = JSONArray.toList(jsonArray, new Employee(), new JsonConfig());
        list.stream().forEach(item -> map.put(item.getId(), item));
    }

    @Override
    public boolean addEmployee(Employee employee) {
        return false;
    }

    @Override
    public boolean deleteEmployee(int id) {
        return false;
    }

    @Override
    public Employee getEmployeeById(int id) {
        return null;
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        return false;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return new ArrayList<Employee>(map.values());
    }
}


