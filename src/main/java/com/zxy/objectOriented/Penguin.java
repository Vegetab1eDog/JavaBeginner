package com.zxy.objectOriented;

public class Penguin extends Animal implements AnimalAction{
    public Penguin(String myName, int myid) {
        super(myName, myid);
    }

    @Override
    public void testOverride() {
        System.out.println("This is Penguin's testOverride.");
    }

    public void testOverload(String msg){
        System.out.println("This is Penguin's testOverload with 1 msg:"+msg+".");
    }

    public void eat(){
        System.out.println("Penguin "+getName()+ " is eating.");
    }
    public void sleep(){
        System.out.println("Penguin "+getName()+ " is sleeping.");
    }
    public void showMessage(){
        System.out.println("This is Penguin "+getName()+ ".");
    }
}
