package com.abdelslam.peopledbs.repository;

import com.abdelslam.peopledbs.model.Person;
import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class PeopleRepositoryTests {
@Test
    public void canSave(){
    PeopleRepository repo = new PeopleRepository();
    Person john = new Person("John" , "Smith" ,ZonedDateTime.of(1990, 1, 1, 0, 0, 0, 0, ZoneId.of("+5")));
    repo.save(john);
}

}
