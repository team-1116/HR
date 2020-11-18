package cn.kgc.employee.service.service.impl;

import cn.kgc.employee.service.mapper.JobsMapper;
import cn.kgc.employee.service.service.JobsService;
import cn.kgc.personnel.common.pojo.Jobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 86188 on 2020/11/18.
 */
@Service
public class JobsServiceImpl implements JobsService {
    @Autowired
    private JobsMapper jobsMapper;

    //根据员工id查询所在部门的工作岗位
    @Override
    public List<Jobs> selectJobs(Integer employeesID) {
        return jobsMapper.selectJobs(employeesID);
    }
}
