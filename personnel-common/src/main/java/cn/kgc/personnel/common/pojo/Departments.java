package cn.kgc.personnel.common.pojo;

/**
 * Created by 86188 on 2020/11/18.
 * 部门表
 */
public class Departments {
    private Integer departmentId;//部门表的主键列。
    private String departmentName;//部门名称
    private Integer managerId;//部门的Manager_id
    private Integer locationId;//部门所在的位置id

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }
}
