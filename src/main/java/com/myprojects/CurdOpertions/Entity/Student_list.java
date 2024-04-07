package com.myprojects.CurdOpertions.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="student_list")
public class Student_list {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String Name;
    private int classd;
    private String Email;
    @Column(name="SGroups")
    private String SGroups;

    public Student_list() {
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getClassd() {
        return classd;
    }

    public void setClassd(int classd) {
        this.classd = classd;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSGroups() {
        return SGroups;
    }

    public void setSGroups(String SGroups) {
        this.SGroups = SGroups;
    }
}


