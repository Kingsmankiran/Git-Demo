package com.kiran;

public class Arthematic {
    public int add(int a,int b){
        return a+b;
    }
    public int subtract(int a,int b){
        return a-b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a%b;
    }
    public static void main(String args[]){
        Arthematic a1 = new Arthematic();
        System.out.println("addition of two numbers: "+a1.add(5,6));
        System.out.println("subtracting of two numbers: "+a1.subtract(5,6));
        System.out.println("multiplication of two numbers: "+a1.mul(5,6));
        System.out.println("division of two numbers: "+a1.div(5,6));
        System.out.println("This is a new  change")
    }
}

