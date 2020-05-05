package com.example.laboratorio3.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="job_history")
public class JobHistory {

    @Id
    private Integer job_historyid;
    @ManyToOne
    @JoinColumn(name="job_id")
    private Job job;
    @ManyToOne
    @JoinColumn(name="employee_id")
    private Employees employee;
    private Date start_date;
    private Date end_date;
    @ManyToOne
    @JoinColumn(name="department_id")
    private Department department;


    public Integer getJob_historyid() {
        return job_historyid;
    }

    public void setJob_historyid(Integer job_historyid) {
        this.job_historyid = job_historyid;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public Integer getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }
}
