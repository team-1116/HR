package cn.kgc.employee.service.service.impl;

import cn.kgc.employee.service.mapper.EmployeesMapper;
import cn.kgc.employee.service.service.EmployeesService;
import cn.kgc.personnel.common.pojo.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 86188 on 2020/11/18.
 */
@Service
public class EmployeesServiceImpl implements EmployeesService {
    @Autowired
    private EmployeesMapper employeesMapper;


    /*
        根据员工id查询员工信息
    */
    @Override
    public Employees getEmployees(Integer employeesID) {
        return employeesMapper.selectEmployees(employeesID);
    }

    /*
        根据员工id修改员工信息
    */
    @Override
    public Integer setEmployees(Employees employees) {
        return employeesMapper.updateEmployees(employees);
    }
}
