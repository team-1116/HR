package cn.kgc.personnel.common.pojo;

import java.util.Date;

/**
 * Created by 86188 on 2020/11/17.
 * 工作历史表
 */
public class JobHistory {
    private Integer employeeId;//主键
    private Date startDate;//员工在本岗位上的起始日
    private Date endDate;//员工在本岗位上的最后一天
    private String jobId;//员工过去工作的职位
    private Integer departmentId;//员工过去工作的部门id

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }
}
