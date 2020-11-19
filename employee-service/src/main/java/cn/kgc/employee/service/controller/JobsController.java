package cn.kgc.employee.service.controller;

import cn.kgc.employee.service.service.JobsService;
import cn.kgc.personnel.common.pojo.Departments;
import cn.kgc.personnel.common.pojo.Employees;
import cn.kgc.personnel.common.pojo.Jobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    //查询所有部门
    @GetMapping("/job")
    public List<Departments> getDeps() {
        return jobsService.getDeps();
    }

    ////根据部门id查询其包含的工作岗位
    @GetMapping("/job1/{departmentId}")
    public List<Jobs> getJobsByDepId(@PathVariable("departmentId") Integer departmentId) {
        return jobsService.getJobsByDepId(departmentId);
    }

    //跨部门申请调岗
    @PutMapping("/job/{employeesID}")
    public Integer setDepAndJob(@PathVariable("employeesID") Integer employeesID,
                                @RequestBody Employees employees) {
        return jobsService.setDepAndJob(employees);
    }


    /*@GetMapping("job2/{employeesID}")
    public Jobs getJob(@PathVariable("employeesID") Integer employeesID,
                       @RequestBody Employees employees) {
        Jobs job = jobsService.getJob(employees);
        return job;
    }*/
}
