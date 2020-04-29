package com.company;

public class ArrayDemo02 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = 6;
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        int[]arr2 = arr;
        arr2[0] = 1;
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
    }
}
