package com.cse.oop.courseprojects;

public class Practise04 {
    public static void main(String[] args) {
        // Strings
        // concatenate
        String name1 = "Shafayat";
        String name2 = "Fahim";
        String fullName = name1 + " " + name2;
        System.out.println(fullName);

        // chatAt
        System.out.println(name1.charAt(0));

        // length
        System.out.println(fullName.length());

        // replace
        String city = "dhaka";
        String city2 = city.replace("a", "*");
        System.out.println(city2);
        System.out.println(city);

        // substring
        System.out.println(fullName.substring(0, 8)); // in java, have to add +1 for desired last index


    }
}
