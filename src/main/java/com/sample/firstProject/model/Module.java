package com.sample.firstProject.model;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "Module",catalog = "time_table")
public class Module implements java.io.Serializable {
    private Long id; //20
    private String moduleCode; //100
    private String moduleName; //100
    private Schedule schedule;

    public Module(Long id, String moduleCode, String moduleName) {
        this.id = id;
        this.moduleCode = moduleCode;
        this.moduleName = moduleName;
    }
    @Id
    @GeneratedValue(strategy=IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name="modulecode", nullable=false, length=100)
    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }
    @Column(name="modulename", nullable=false, length=100)
    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_role")////need a change on column
    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
}
