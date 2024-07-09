package com.abdelslam.peopledb.repository;

import com.abdelslam.peopledb.model.Person;
import org.junit.jupiter.api.AfterEach;
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
    private PeopleRepository repo;

    @BeforeEach
    void setUp() throws SQLException {
        connection = DriverManager.getConnection("jdbc:h2:/home/abdelslam/Desktop/Courses/Java/people-test");
        connection.setAutoCommit(false);

        repo = new PeopleRepository(connection);
    }

    @AfterEach
    void tearDown() throws SQLException {
        if(connection != null)
        {
            connection.close();

        }
    }

    @Test
    void canSaveOnePerson() throws SQLException {
        Person john = new Person("john" , "smith" , ZonedDateTime.of(1990,11,15,15,15,15,0, ZoneId.of("-6")));
        Person savedPerson = repo.save(john);
        assertThat(savedPerson.getId()).isGreaterThan(0);
    }

    @Test
    void canSaveTowPeople() {
        Person john = new Person("john" , "smith" , ZonedDateTime.of(1990,11,15,15,15,15,0, ZoneId.of("-6")));
        Person bobby = new Person("bobby" , "smith" , ZonedDateTime.of(1992,1,25,15,15,15,0, ZoneId.of("-6")));
        Person savedPerson1 = repo.save(john);
        Person savedPerson2 = repo.save(bobby);
        assertThat(savedPerson1.getId()).isNotEqualTo(savedPerson2.getId());
    }
}
