package cn.kgc.personnel.common.pojo;

import java.util.Date;

/**
 * @program: personnel
 * @ClassName Employees
 * @description:
 * @author: 熊盛涛
 * @create: 2020-11-17 18:43
 * @Version 1.0
 **/
/*
    员工表
 */
public class Employees {
        /*
        员工表主键
         */
        private Integer employeesID;

        /*
            员工姓名
         */
        private String firstName;
        /*
            员工的姓
         */
        private String lastName;
        /*
        电子邮箱
         */
        private String Emall;
        /*
            联系电话
         */
        private  String phoneNumber;
        /*
            员工开始工作的日期
         */
        private Date hireDate;

        /*
            员工目前从事的职位，与job表关联
         */
        private  String jobId;

        /*
              员工月薪
         */
        private  double salary;

        /*
             员工提成比例
         */
        private double commissionPct;

        /*
            与manager_id相同的域在
            部门表。员工表的employee_id列的外键。
         */
        private Integer managerId;
        /*
            员工所在部门id;外键到department_id
            部门表的列
         */
        private Integer departmentId;

        /*
            部门对象
         */
        private Departments departments;

        private Jobs jobs;

    public Jobs getJobs() {
        return jobs;
    }

    public void setJobs(Jobs jobs) {
        this.jobs = jobs;
    }

    public Departments getDepartments() {
        return departments;
    }

    public void setDepartments(Departments departments) {
        this.departments = departments;
    }


    public Integer getEmployeesID() {
        return employeesID;
    }

    public void setEmployeesID(Integer employeesID) {
        this.employeesID = employeesID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmall() {
        return Emall;
    }

    public void setEmall(String emall) {
        Emall = emall;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getCommissionPct() {
        return commissionPct;
    }

    public void setCommissionPct(double commissionPct) {
        this.commissionPct = commissionPct;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }
}
