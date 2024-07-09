package com.neutrinosys.employees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testNameToSalary() {
        Main main = new Main();
        Main.main(new String[0]);
        int salary = main.getSalary("Wilma");
        assertEquals(2506, salary);
    }
    @Test
    void testWrongNameToSalary() {
        Main main = new Main();
        Main.main(new String[0]);
        int salary = main.getSalary("fffff");
        assertEquals(-1, salary);
    }
}