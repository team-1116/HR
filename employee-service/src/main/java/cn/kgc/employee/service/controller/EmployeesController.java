package cn.kgc.employee.service.controller;

import cn.kgc.employee.service.service.EmployeesService;
import cn.kgc.personnel.common.pojo.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 86188 on 2020/11/18.
 */
@RestController
public class EmployeesController {
    @Autowired
    private EmployeesService employeesService;


    /*
        根据员工id查询员工信息
    */
    @GetMapping("/employee/{employeesID}")
    public Employees getEmployees(@PathVariable("employeesID") Integer employeesID) {
        Employees employees = employeesService.getEmployees(employeesID);
        return employees;
    }

    /*
        根据员工id修改员工信息
    */
    @PutMapping("/employee/{employeesID}")
    public Integer setEmployees(@PathVariable("employeesID") Integer employeesID,
                                @RequestBody Employees employees) {
        return employeesService.setEmployees(employees);
    }

    //本部门申请调岗
    @PutMapping("/employee/{employeesID}")
    public Integer setJob(@PathVariable("employeesID") Integer employeesID,
                          @RequestBody Employees employees) {
        return employeesService.setJob(employees);
    }
}
