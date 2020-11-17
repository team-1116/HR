package cn.kgc.personnel.common.pojo;

/**
 * @program: personnel
 * @ClassName AmendJobs
 * @description:
 * @author: 熊盛涛
 * @create: 2020-11-17 19:26
 * @Version 1.0
 **/
public class AmendJobs {
    private int id;
    private int employee_id;    //员工id
    private int job_id;         //职位id
    private String old_jobs;    //旧的职位
    private String new_jobs;    //新的职位

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public String getOld_jobs() {
        return old_jobs;
    }

    public void setOld_jobs(String old_jobs) {
        this.old_jobs = old_jobs;
    }

    public String getNew_jobs() {
        return new_jobs;
    }

    public void setNew_jobs(String new_jobs) {
        this.new_jobs = new_jobs;
    }
}
