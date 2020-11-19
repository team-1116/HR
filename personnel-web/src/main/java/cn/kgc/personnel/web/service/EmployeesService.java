package cn.kgc.personnel.web.service;


import cn.kgc.personnel.common.pojo.Employees;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("employee-service")
public interface EmployeesService {
    @GetMapping("/employee/{employeesID}")
    public Employees getEmployees(@PathVariable("employeesID") Integer employeesID);

    /*
       根据员工id修改员工信息
   */
    @PutMapping("/employee/{employeesID}")
    public Integer setEmployees(@PathVariable("employeesID") Integer employeesID,
                                @RequestBody Employees employees);

}
