package cn.kgc.employee.service.service;

import cn.kgc.personnel.common.pojo.Departments;
import cn.kgc.personnel.common.pojo.Employees;
import cn.kgc.personnel.common.pojo.Jobs;

import java.util.List;

/**
 * Created by 86188 on 2020/11/18.
 */
public interface JobsService {
    //根据员工id查询所在部门的工作岗位
    List<Jobs> selectJobs(Integer employeesID);

    /*//本部门申请调岗
    Integer setJob(Employees employees);*/

    //查询所有部门
    List<Departments> getDeps();

    //根据部门id查询其包含的工作岗位
    List<Jobs> getJobsByDepId(Integer departmentId);

    //跨部门申请调岗
    Integer setDepAndJob(Employees employees);


    Jobs getJob(Employees employees);
}
