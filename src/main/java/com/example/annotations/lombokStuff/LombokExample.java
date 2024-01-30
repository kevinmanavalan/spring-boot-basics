package com.example.annotations.lombokStuff;

import lombok.*;
import lombok.experimental.Accessors;

public class LombokExample {
    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    public static class Student {
        private @NonNull String name;
        private @NonNull Student student;
    }

    public static void main(String args[]) {
        Student obj = new Student();
        Student obj2 = new Student("Kevin", obj);
        obj.setName("Kevin");
        obj.setStudent(obj);
        System.out.println(obj.getName());
        System.out.println(obj2.getStudent());
    }

    //    @Setter
    @Accessors(fluent = true)
    @Getter
    @Setter
    @RequiredArgsConstructor
    @AllArgsConstructor
    public static class LoginResults {
        private int time;
        private String token;

        public static void main(String args[]) {
            LoginResults obj = new LoginResults(21, "kevin");
            System.out.println(obj.time());
            obj.time(24);
        }
    }
}
