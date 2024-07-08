package com.cse.oop.courseprojects;

import java.util.Arrays;

public class Practise05 {
    public static void main(String[] args) {
        // arrays
        int bangla = 91;
        int english = 90;
        int math = 94;
        int physics = 95;
        int chemistry = 96;

        int[] marks = new int[5];
        marks[0] = 91;
        marks[1] = 90;
        marks[2] = 94;
        marks[3] = 95;
        marks[4] = 96;
        System.out.println(marks);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // length
        System.out.println(marks.length);

        // sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

        int[] age = {34,65,35};
        System.out.println(age[2]);

        

    }
}
