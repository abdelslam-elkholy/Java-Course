package com.abdelslam.peopledb.repository;

import com.abdelslam.peopledb.model.Person;
import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class PeopleRepositoryTests {
    @Test
    void canSave() {
        PeopleRepository repo = new PeopleRepository();
        Person john = new Person("john" , "smith" , ZonedDateTime.of(1990,11,15,15,15,15,0, ZoneId.of("-6")));
        person savedPerson repo.save(john);
    }
}
