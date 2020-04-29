package com.company;

public class Phone {
    // 品牌 、 价格 、 颜色
    String brand;
    int price;
    String color;// 成员变量


    // 方法：给某人打电话
    public void Call(){
        int a = 45; //a 就是局部变量
        System.out.println("打电话");
    }
    // 发短信
    public void Send(){
        System.out.println("发短信");
    }
}

