package cn.kgc.personnel.common.pojo;

/**
 * @program: personnel
 * @ClassName AmendDepartments
 * @description:
 * @author: 熊盛涛
 * @create: 2020-11-17 19:25
 * @Version 1.0
 **/
public class AmendDepartments {
    private int id ;
    private int employee_id;            //员工id
    private int department_id;          //部门id
    private String old_departments;     //旧部门名
    private String new_departments;     //新部门名
    
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

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getOld_departments() {
        return old_departments;
    }

    public void setOld_departments(String old_departments) {
        this.old_departments = old_departments;
    }

    public String getNew_departments() {
        return new_departments;
    }

    public void setNew_departments(String new_departments) {
        this.new_departments = new_departments;
    }
}
