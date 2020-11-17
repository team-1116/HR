package cn.kgc.personnel.common.pojo;

/**
 * Created by 86188 on 2020/11/17.
 * 职位工资表
 */
public class Jobs {
    private String jobId;//主键
    private String jobTitle;//工作标题
    private Integer minSalary;//最低工资
    private Integer maxSalary;//最高工资

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Integer getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(Integer minSalary) {
        this.minSalary = minSalary;
    }

    public Integer getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(Integer maxSalary) {
        this.maxSalary = maxSalary;
    }
}
