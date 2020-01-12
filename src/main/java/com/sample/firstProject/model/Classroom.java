package com.sample.firstProject.model;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "Classroom",catalog = "time_table")
public class Classroom implements java.io.Serializable {
    private  int id;
    private String roomNo;
    private String building;
    private Schedule schedule;

    public Classroom(int id, String roomNo, String building, Schedule schedule) {
        this.id = id;
        this.roomNo = roomNo;
        this.building = building;
        this.schedule = schedule;
    }
    @Id
    @GeneratedValue(strategy=IDENTITY)
    @Column(name="modculeid", unique=true, nullable=false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name="roomno", length=3)
    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }
    @Column(name="building", length=10)
    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="")
    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

}
