package com.hd.dto;

public class Main {

    public static void main(String[] args) {

        //测试一下写的这几个方法
        MyArray<Integer> myArray = new MyArray<>();
        myArray.add(1);
        myArray.add(2);
        myArray.add(0, 0);
        System.out.println(myArray);
        myArray.set(0, -1);
        System.out.println(myArray.get(0));
        myArray.remove(0);
        System.out.println(myArray);


    }
}
