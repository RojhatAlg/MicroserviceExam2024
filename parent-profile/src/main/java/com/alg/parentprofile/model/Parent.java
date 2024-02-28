package com.alg.parentprofile.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Parent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;


    /*
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "mom")
    private List<ChildProfile> childrenAsMom;

    @OneToMany(mappedBy = "dad")
    private List<ChildProfile> childrenAsDad;

     */

    public Parent() {
    }

    public Parent(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /*

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<ChildProfile> getChildrenAsMom() {
        return childrenAsMom;
    }

    public void setChildrenAsMom(List<ChildProfile> childrenAsMom) {
        this.childrenAsMom = childrenAsMom;
    }

    public List<ChildProfile> getChildrenAsDad() {
        return childrenAsDad;
    }

    public void setChildrenAsDad(List<ChildProfile> childrenAsDad) {
        this.childrenAsDad = childrenAsDad;
    }

     */
}
