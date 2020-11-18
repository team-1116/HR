package cn.kgc.employee.service.mapper;

import cn.kgc.personnel.common.pojo.Employees;

/**
 * Created by 86188 on 2020/11/18.
 */
public interface EmployeesMapper {
    /*
        根据员工id查询员工信息
    */
    Employees selectEmployees(Integer employeesID);

    /*
        根据员工id修改员工信息
    */
    Integer updateEmployees(Employees employees);

    //本部门申请调岗
    Integer updateJob(Employees employees);
}
