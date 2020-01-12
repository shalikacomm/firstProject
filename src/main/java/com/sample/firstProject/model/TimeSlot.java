package com.sample.firstProject.model;

import javax.persistence.*;
import java.sql.Time;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table (name = "timeslot",catalog = "time_table")
public class TimeSlot implements java.io.Serializable {
    private int id;
    private String day;
    private Time startingTime;
    private Time finishingTime;
    public Schedule schedule;

    public TimeSlot(int id, String day, Time startingTime, Time finishingTime, Schedule schedule) {
        this.id = id;
        this.day = day;
        this.startingTime = startingTime;
        this.finishingTime = finishingTime;
        this.schedule = schedule;
    }
    @Id
    @GeneratedValue(strategy=IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name="Day", nullable=false, length=10)
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
    @Column(name="starting_time", length=10)
    public Time getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(Time startingTime) {
        this.startingTime = startingTime;
    }
    @Column(name="finishingtime")
    public Time getFinishingTime() {
        return finishingTime;
    }

    public void setFinishingTime(Time finishingTime) {
        this.finishingTime = finishingTime;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_role")// change
    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
}
