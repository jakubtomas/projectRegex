package com.company;

import sk.itsovy.data.DataIP;
import sk.itsovy.data.MacAddress;
import sk.itsovy.data.PersonalID;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

    public static void main(String[] args) {
        // write your code here


        DataIP data = new DataIP();
        System.out.println(data.get());
        checkIpAddress((ArrayList) data.get());


        System.out.println("--------------------------------------------------");
        PersonalID personalID = new PersonalID();
        checkDateNumber((ArrayList) personalID.get());
        System.out.println("--------------------------------------------------");

        MacAddress macAddress = new MacAddress();
        checkMacAddress((ArrayList) macAddress.get());
        System.out.println("--------------------------------------------------");


        sk.itsovy.data.Date date1 = new sk.itsovy.data.Date();
        checkDate((ArrayList) date1.get());
        //PersonalID personalId=new PersonalID();

        // Its necessary  t o import another library for personal ID

    }

    private static void checkIpAddress(ArrayList inputArrayList) {

        // List arrayList = data.get();
        List arrayList = inputArrayList;

        final String pattern = "^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        for (int i = 0; i < arrayList.size(); i++) {

            if (arrayList.get(i) != null) {

                Matcher m = r.matcher(String.valueOf(arrayList.get(i))); // try to use String.valueOF
                if (m.find()) {
                    System.out.println("Found value: " + m.group(0));

                }
            }
        }

    }

    private static void checkDateNumber(ArrayList inputArrayList) {

        // List arrayList = data.get();
        List arrayList = inputArrayList;

        String pattern = "^[0-9]{2}[0156][0-9]{3}/?[0-9]{3,4}$";
        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        for (int i = 0; i < arrayList.size(); i++) {

            if (arrayList.get(i) != null) {

                Matcher m = r.matcher(String.valueOf(arrayList.get(i))); // try to use String.valueOF
                if (m.find()) {
                    System.out.println("Found value: " + m.group(0));

//                resultList.add(m.group(0));

                }
            }
        }


    }

    private static void checkMacAddress(ArrayList inputArrayList) {

        // List arrayList = data.get();
        List arrayList = inputArrayList;

        String pattern = "^([0-9A-Fa-f][0-9A-Fa-f][\\:]){5}[0-9A-Fa-f]{2}$";
        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        for (int i = 0; i < arrayList.size(); i++) {

            if (arrayList.get(i) != null) {
                Matcher m = r.matcher(String.valueOf(arrayList.get(i))); // try to use String.valueOF
                if (m.find()) {
                    System.out.println("Found value: " + m.group(0));
                }
            }
        }
    }


    private static void checkDate(ArrayList inputArraylist) {
        List arrayList = inputArraylist;

        String pattern= "^((([1-9]|[12][0-9]|3[0-1])\\.(1|3|5|7|8|10|12))|(([1-9]|[12][0-9]|30)\\.(4|6|9|11))|(([1-9]|[12][0-9])\\.2))\\.(19|20)[0-9]{2}$";

        Pattern r = Pattern.compile(pattern);

        for (int i = 0; i < arrayList.size(); i++) {

            if (arrayList.get(i) != null) {
                Matcher m = r.matcher(String.valueOf(arrayList.get(i))); // try to use String.valueOF
                if (m.find()) {
                    System.out.println("Found value: " + m.group(0));
                }
            }


        }
    }


}
