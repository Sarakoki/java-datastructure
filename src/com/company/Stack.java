package com.company;

import java.util.ArrayList;

public class Stack {
    //your code is here
    private ArrayList<Integer> stackArr = new ArrayList<Integer>(3);
    private int counter=0;

    public void push(int x){
       //your code is here
        stackArr.add(x);
    }
    public void pop() {
        //your code is here
        stackArr.remove(stackArr.size() - 1);
    }
    public void PrintElements(){
        System.out.println(stackArr);
    }

}