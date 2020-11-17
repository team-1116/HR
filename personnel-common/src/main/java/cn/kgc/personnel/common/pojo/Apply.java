package cn.kgc.personnel.common.pojo;

import java.util.Date;

/**
 * Created by 86188 on 2020/11/17.
 * 申请表
 */
public class Apply {
    private Integer id;
    private Integer numberId;//单号id
    private Integer employeeId;//操作者id
    private Integer jobId;//职位id
    private Integer departmentId;//部门id
    private Date time;//操作时间
    private Integer state;//状态 1未审核2已审核

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumberId() {
        return numberId;
    }

    public void setNumberId(Integer numberId) {
        this.numberId = numberId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
