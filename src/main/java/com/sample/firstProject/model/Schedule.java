package com.sample.firstProject.model;

import javax.persistence.*;


import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "schedule",catalog = "time_table")
public class Schedule implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy=IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    private long id;
    @ManyToOne @JoinColumn(name = "module")
    private Module module;
    @ManyToOne
    private TimeSlot timeSlot;
    @ManyToOne
    private Classroom classroom;

    public Schedule(Module module, TimeSlot timeSlot, Classroom classroom) {
        this.module = module;
        this.timeSlot = timeSlot;
        this.classroom = classroom;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public TimeSlot getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(TimeSlot timeSlot) {
        this.timeSlot = timeSlot;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
}
