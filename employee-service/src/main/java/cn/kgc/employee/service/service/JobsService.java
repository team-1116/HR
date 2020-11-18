package cn.kgc.employee.service.service;

import cn.kgc.personnel.common.pojo.Jobs;

import java.util.List;

/**
 * Created by 86188 on 2020/11/18.
 */
public interface JobsService {
    //根据员工id查询所在部门的工作岗位
    List<Jobs> selectJobs(Integer employeesID);


}
