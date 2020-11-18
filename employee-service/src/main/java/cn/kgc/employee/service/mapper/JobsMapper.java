package cn.kgc.employee.service.mapper;

import cn.kgc.personnel.common.pojo.Jobs;

import java.util.List;

/**
 * Created by 86188 on 2020/11/18.
 */
public interface JobsMapper {
    //根据员工id查询所在部门的工作岗位
    List<Jobs> selectJobs(Integer employeesID);


}
