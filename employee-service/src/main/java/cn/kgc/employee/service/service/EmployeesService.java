package cn.kgc.employee.service.service;

import cn.kgc.personnel.common.pojo.Employees;

/**
 * Created by 86188 on 2020/11/18.
 */
public interface EmployeesService {
    /*
        根据员工id查询员工信息
    */
    Employees getEmployees(Integer employeesID);

    /*
        根据员工id修改员工信息
    */
    Integer setEmployees(Employees employees);

    //本部门申请调岗
    Integer setJob(Employees employees);
}
