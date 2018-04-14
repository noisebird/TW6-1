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
    //添加员工
    @RequestMapping(value="/add",method = RequestMethod.POST)
    public String addEmployee(@ModelAttribute Employee employee) {
        if (employeeService.addEmployee(employee)) {
            return "添加员工成功";
        }
        return "添加员工失败";
    }

    //删除员工
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public String deleteEmployee(@PathVariable("id") int id) {
        if (employeeService.deleteEmployee(id)) {
            return "删除员工成功";
        }
        return "删除员工失败";
    }

    //    根据id查找员工
    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
    public String findEmployeeById(@PathVariable int id) {
        if (employeeService.getEmployeeById(id) != null) {
            return JSONObject.fromObject(employeeService.getEmployeeById(id)).toString();
        }
        return "";
    }

    //    获取所有员工列表
    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String getAllEmployeeList() {
        return JSONArray.fromObject(employeeService.getAllEmployees()).toString();
    }
//    更新员工列表
    @RequestMapping(value="update",method = RequestMethod.POST)
    public String updateEmployeeList(@ModelAttribute  Employee employee){
        if (employeeService.updateEmployee(employee)) {
            return "更新员工成功";
        }
        return "更新员工列表失败";
    }
}
