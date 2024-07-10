package com.abdelslam.peopledbs.repository;

import com.abdelslam.peopledbs.model.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.assertj.core.api.Assertions.assertThat;

public class PeopleRepositoryTests {


    private Connection connection;

    @BeforeEach
    void setUp() throws SQLException {
        connection = DriverManager.getConnection("jdbc:h2:/home/abdelslam/Desktop/Courses/Java/people-test");
    }

    @Test
    public void canSaveOnePerson() {

        PeopleRepository repo = new PeopleRepository(connection);
        Person john = new Person("John", "Smith", ZonedDateTime.of(1990, 1, 1, 0, 0, 0, 0, ZoneId.of("+5")));
        Person savedPerson = repo.save(john);
        assertThat(savedPerson.getId()).isGreaterThan(0);


    }

    @Test
    public void canSaveTwoPerson() {
        PeopleRepository repo = new PeopleRepository(connection);
        Person john = new Person("John", "Smith", ZonedDateTime.of(1990, 1, 1, 0, 0, 0, 0, ZoneId.of("+5")));
        Person adam = new Person("Adam", "Smith", ZonedDateTime.of(1995, 1, 1, 0, 0, 0, 0, ZoneId.of("+5")));
        Person savedPersonOne = repo.save(john);
        Person savedPersonTwo = repo.save(adam);
        assertThat(savedPersonOne.getId()).isNotEqualTo(savedPersonTwo.getId());


    }
}
