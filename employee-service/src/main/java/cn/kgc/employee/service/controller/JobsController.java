package cn.kgc.employee.service.controller;

import cn.kgc.employee.service.service.JobsService;
import cn.kgc.personnel.common.pojo.Jobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 86188 on 2020/11/19.
 */
@RestController
public class JobsController {
    @Autowired
    private JobsService jobsService;

    //根据员工id查询所在部门的工作岗位
    @GetMapping("/job/{employeesID}")
    public List<Jobs> selectJobs(@PathVariable("employeesID") Integer employeesID) {
        return jobsService.selectJobs(employeesID);
    }

    /*//本部门申请调岗
    @PutMapping("/job/{employeesID}")
    public Integer setJob(@PathVariable("employeesID") Integer employeesID,
                          @RequestBody Employees employees) {
        return jobsService.setJob(employees);
    }*/
}
