package cn.kgc.personnel.common.pojo;

/**
 * Created by 86188 on 2020/11/17.
 * 记录表
 *
 *
 * id          number(10),
 EMPLOYEE_ID NUMBER(6),          --员工id
 record      varchar2(30),
 reason      number              --原因0成功，1权限不足，2其他
 */
public class Record {
    private Integer id;
    private Integer employeeId; //-员工id
    private String record;
    private Integer reason; //--原因0成功，1权限不足，2其他


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public Integer getReason() {
        return reason;
    }

    public void setReason(Integer reason) {
        this.reason = reason;
    }
}
