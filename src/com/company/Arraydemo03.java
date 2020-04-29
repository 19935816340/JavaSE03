package com.company;

public class Arraydemo03 {
    public static void main(String[] args) {
        //创建一个数组
        int[]arr = {10,54,26,5,655};
        //求arr中的最大值
        //定义一个最大值，存储数值中的最大的值，假设此时arr中的第一个值是最大的
        int max = arr[0];
        //遍历数组，取出每一个元素，让每一个元素和max进行比较
        for (int i = 0; i < arr.length; i++) {
            //遍历元素和max进行比较，如果大于max，就更新max的值
            if (arr[i] > max)
                max = arr[i];//max始终是记录的最大值
        }
        System.out.println("最大值是"+max);
    }
}
