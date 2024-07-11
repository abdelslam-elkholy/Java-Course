package com.abdelslam.peopledbs.model;

import java.time.ZonedDateTime;

public class Person {
    private final String firstName;
    private final String lastName;
    private final ZonedDateTime dob;
    private Long id;

    public Person(String firstName, String lastName, ZonedDateTime dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob=dob;

    }


    public Long getId() {
        return 1L;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public ZonedDateTime getDob() {
        return dob;
    }

    public String getFirstName() {
    }
}
