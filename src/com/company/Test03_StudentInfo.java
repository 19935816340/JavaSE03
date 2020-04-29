package com.company;

public class Test03_StudentInfo {
    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo();
        System.out.println(studentInfo.getName());
        studentInfo.setName("赵云");
        System.out.println(studentInfo.getName());
    }
}
