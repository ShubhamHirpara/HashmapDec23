package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> creds = new HashMap<>(); //16
        String str1 = new String("abc");
        String str2 = new String("abc");
        creds.put(str1,123);
        // step 1: calculate Hashcode: 55667 % sizeOfAL16
        // step 2: Calculate Index: some sort of Modulo Op -> 0-15 -> 3

        ArrayList<Integer> nums = new ArrayList<>(); //10

        creds.put(str2,456);
        //System.out.println(creds);

        Map<Student,String> attd = new HashMap<>();
        List<Integer> phNos = new ArrayList<>();
        phNos.add(555666778);
        phNos.add(666777888);
        phNos.add(444555333);
        Address address = new Address("Brampton");
        Student s2 = new Student(1,"Sam","Smith",phNos,address);
        SpecialStudent ss = new SpecialStudent(2,"Scott","Smith",phNos,address,"admin");
        //33445 -> 5
        attd.put(s2,"Present");
        attd.put(s2,"Absent");
        attd.put(ss,"Present");
        //Student(1,"John","Smith"); -> 66778
        s2.getPhoneNos().add(33444555);
        s2.getAddress().setCity("Toronto");
        ss.setRole("SuperAdmin");
        System.out.println(attd.get(ss));
        // s1: cal HC -> 66778
        //s2: cal Index -> 5
        /*
        *
        * */
    }
}