package com.abdelslam.peopledbs.repository;

import com.abdelslam.peopledbs.model.Person;
import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.assertj.core.api.Assertions.assertThat;

public class PeopleRepositoryTests {
    @Test
    public void canSaveOnePerson() {
        PeopleRepository repo = new PeopleRepository();
        Person john = new Person("John", "Smith", ZonedDateTime.of(1990, 1, 1, 0, 0, 0, 0, ZoneId.of("+5")));
        Person savedPerson = repo.save(john);
        assertThat(savedPerson.getId()).isGreaterThan(0);


    }

    @Test
    public void canSaveTwoPerson() {
        PeopleRepository repo = new PeopleRepository();
        Person john = new Person("John", "Smith", ZonedDateTime.of(1990, 1, 1, 0, 0, 0, 0, ZoneId.of("+5")));
        Person savedPerson = repo.save(john);
        assertThat(savedPerson.getId()).isGreaterThan(0);


    }
}
