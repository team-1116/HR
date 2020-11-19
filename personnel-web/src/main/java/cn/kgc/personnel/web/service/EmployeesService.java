package cn.kgc.personnel.web.service;


import cn.kgc.personnel.common.pojo.Employees;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("employee-service")
public interface EmployeesService {
    @GetMapping("/employee/{employeesID}")
    public Employees getEmployees(@PathVariable("employeesID") Integer employeesID);
}
