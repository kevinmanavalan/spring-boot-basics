package com.example.annotations.builder;

public class Sample {
    String name = "abc";

    public String print() {
        new A().abc(new Sample());
        return name;
    }

    public static void main(String args[]) {
        Sample s = new Sample();
        System.out.println("frommain=" + s + s.name);
        s.print();
    }

    static class A {
        public void abc(Sample sample) {
            System.out.println("fromabc=" + sample);
            System.out.println(sample.name);
        }
    }
}


