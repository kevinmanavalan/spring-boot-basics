package com.example.annotations.builder;

import lombok.*;

@ToString
@Getter
public class Student {    //WITHOUT THE @BUILDER ANNOTATION
    private final String name;
    private final int age;
    private final boolean isStudying;

    private Student(StudentBuilder studentBuilder) {
        this.name = studentBuilder.name;
        this.age = studentBuilder.age;
        this.isStudying = studentBuilder.isStudying;
    }

    @RequiredArgsConstructor
    //TO SET THE PARAMETERIZED CONSTRUCTOR
    public static class StudentBuilder {
        @NonNull        //TO ONLY INCLUDE SPECIFIC FIELDS IN THE ANNOTATED CONSTRUCTOR
        private final String name;
        @NonNull
        private final int age;

        private boolean isStudying;

        public StudentBuilder setStudying(boolean isStudying) {
            this.isStudying = isStudying;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}

class StudentCustomer {
    public static void main(String args[]) {
        Student student = new Student.StudentBuilder("Kevin", 24).setStudying(true).build();
        System.out.println(student);
    }
}
