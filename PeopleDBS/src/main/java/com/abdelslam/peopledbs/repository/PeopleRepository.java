package com.abdelslam.peopledbs.repository;

import com.abdelslam.peopledbs.model.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PeopleRepository {

    private Connection connection;
    public PeopleRepository(Connection connection) {
    this.connection=connection;
    }



    public Person save(Person person) {
        String  sql = String.format("INSERT INTO PEOPLE (FIRST_NAME,LAST_NAME,DOB) VALUES(?,?,?)");
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,person.getFirstName());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return person;
    }
}
