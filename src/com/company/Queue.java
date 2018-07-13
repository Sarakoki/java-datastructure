package com.company;
import java.util.ArrayList;

public class Queue {
   // your code is here
  private ArrayList<Integer> queueArr = new ArrayList<Integer>(3);
  int counter=0;

    public void push(int x){
       //your code is here
      queueArr.add(x);
      counter++;

    }
    public void pop(){
        //your code is here
      queueArr.remove(counter -1);
      counter--;
    }
    public void display(){
        //your code is here
      System.out.println(queueArr);

    }

}