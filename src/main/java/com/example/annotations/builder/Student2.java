package com.example.annotations.builder;

import com.example.annotations.lombokStuff.LombokExample;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
public class Student2 {    //WITH THE @BUILDER ANNOTATION
    private final String name;
    private final int age;
    private final boolean isWorking;
    private final boolean isInterning;
    private final String company;
}

class StudentFactory {
    public static void main(String[] args) {
        Student2 student = Student2.builder().name("Kevin").age(24).isInterning(true).isWorking(true).company("RazorPay").build();
        System.out.println(student);
    }
}
