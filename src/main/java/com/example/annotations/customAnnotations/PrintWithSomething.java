package com.example.annotations.customAnnotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface PrintWithSomething {
    public String appendSomething() default "hi";
}

class Sample {
    @PrintWithSomething(appendSomething = "hello ")
    public void print(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Sample sample = new Sample();
        java.lang.reflect.Method method = Sample.class.getMethod("print", String.class);
        PrintWithSomething annotation = method.getAnnotation(PrintWithSomething.class);
        String wish = annotation.appendSomething();
        sample.print(wish + "Kevin");
    }
}

