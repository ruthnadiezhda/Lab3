package com.example.laboratorio3.entity;


import javax.persistence.*;

@Entity

@Table(name ="departments")
public class Department {


    @Id
    Integer department_id;
    String department_name;
    Integer manager_id;
    @ManyToOne
    @JoinColumn(name="location_id")
    Location location;

    public Integer getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public Integer getManager_id() {
        return manager_id;
    }

    public void setManager_id(Integer manager_id) {
        this.manager_id = manager_id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
