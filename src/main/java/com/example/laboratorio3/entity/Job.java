package com.example.laboratorio3.entity;


import javax.persistence.*;

@Entity
@Table(name="jobs")
public class Job {

    @Id
    @JoinColumn(name="job_id")
    String job_id;
    String job_tittle;
    Integer min_salary;
    Integer max_salary;

    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public String getJob_tittle() {
        return job_tittle;
    }

    public void setJob_tittle(String job_tittle) {
        this.job_tittle = job_tittle;
    }

    public Integer getMin_salary() {
        return min_salary;
    }

    public void setMin_salary(Integer min_salary) {
        this.min_salary = min_salary;
    }

    public Integer getMax_salary() {
        return max_salary;
    }

    public void setMax_salary(Integer max_salary) {
        this.max_salary = max_salary;
    }
}
