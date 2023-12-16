package com.abdelslam.peopledb.repository;

import com.abdelslam.peopledb.model.Person;
import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.assertj.core.api.Assertions.assertThat;

public class PeopleRepositoryTests {
    @Test
    void canSave() {
        PeopleRepository repo = new PeopleRepository();
        Person john = new Person("john" , "smith" , ZonedDateTime.of(1990,11,15,15,15,15,0, ZoneId.of("-6")));
        Person savedPerson = repo.save(john);
        assertThat(savedPerson.getId()).isGreaterThan(0);
    }
}
