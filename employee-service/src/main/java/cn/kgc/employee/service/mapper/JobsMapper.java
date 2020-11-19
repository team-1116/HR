package cn.kgc.employee.service.mapper;

import cn.kgc.personnel.common.pojo.Departments;
import cn.kgc.personnel.common.pojo.Employees;
import cn.kgc.personnel.common.pojo.Jobs;

import java.util.List;

/**
 * Created by 86188 on 2020/11/18.
 */
public interface JobsMapper {
    //根据员工id查询所在部门的工作岗位
    List<Jobs> selectJobs(Integer employeesID);

    //查询所有部门
    List<Departments> selectDeps();

    //根据部门id查询其包含的工作岗位
    List<Jobs> selectJobsByDepId(Integer departmentId);

    //跨部门申请调岗
    Integer updateDepAndJob(Employees employees);




    /*//本部门申请调岗
    Integer updateJob(Employees employees);*/
}
