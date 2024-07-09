package com.abdelslam.peopledb.repository;

import com.abdelslam.peopledb.model.Person;

import java.sql.*;
import java.time.ZoneId;

public class PeopleRepository {
    public static final String SQL = "Insert INTO people (FIRST_NAME , LAST_NAME, DOB) VALUES (? ,? ,?)";
    private Connection connection;
    public PeopleRepository(Connection connection) {
        this.connection = connection;
    }

    public Person save(Person person) {
  
        try {
            PreparedStatement ps = connection.prepareStatement(SQL , Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, person.getFirstName());
            ps.setString(2, person.getLastName());
            ps.setTimestamp(3, Timestamp.valueOf(person.getDob().withZoneSameInstant(ZoneId.of("+0")).toLocalDateTime()));
            int recordAffected = ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            while (rs.next()) {
                long id = rs.getLong(1);
                person.setId(id);
                System.out.println(person);
            }
            System.out.printf("Records affected %d%n",recordAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return person;
    }

}
