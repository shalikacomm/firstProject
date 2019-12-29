package com.sample.firstProject.model;

// Generated Dec 15, 2019 9:46:16 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * UserRole generated by hbm2java
 */
@Entity
@Table(name="user_role"
        ,catalog="user_register"
)
public class UserRole  implements java.io.Serializable {


    private Long id;
    private String name;
    private String status;
    private Set<User> users = new HashSet<User>(0);

    public UserRole() {
    }


    public UserRole(String name) {
        this.name = name;
    }
    public UserRole(String name, String status, Set<User> users) {
        this.name = name;
        this.status = status;
        this.users = users;
    }

    @Id @GeneratedValue(strategy=IDENTITY)


    @Column(name="id", unique=true, nullable=false)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Column(name="name", nullable=false, length=50)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Column(name="status", length=15)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @OneToMany(fetch=FetchType.LAZY, mappedBy="userRole")
    public Set<User> getUsers() {
        return this.users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }




}


