package com.example.annotations.builder;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StudentTest {
    @Test
    void BuilderTest() {
        Student student = new Student.StudentBuilder("Kevin", 24).setStudying(true).build();
        assertEquals("Kevin", student.getName());
        assertEquals(24, student.getAge());
        assertTrue(student.isStudying());
    }
}