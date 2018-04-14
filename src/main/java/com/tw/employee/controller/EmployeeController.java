package com.tw.employee.controller;

import com.tw.employee.dao.Employee;
import com.tw.employee.service.EmployeeService;
import com.tw.employee.service.EmployeeServiceImpl;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wangjie on 2018/4/13.
 */
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    //    获取所有员工列表
    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String getAllEmployeeList() {
        return JSONArray.fromObject(employeeService.getAllEmployees()).toString();
    }

}
