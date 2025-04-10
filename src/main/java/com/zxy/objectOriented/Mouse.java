package com.zxy.objectOriented;

public class Mouse extends Animal implements AnimalAction{
    public Mouse(String myName, int myid) {
        super(myName, myid);
    }

    @Override
    public void testOverride() {
        System.out.println("This is Mouse's testOverride.");
    }
    public void testOverload(String msg1,String msg2){
        System.out.println("This is Mouse's testOverload with 2 msg"+msg1+" "+msg2+".");
    }

    public void eat(){
        System.out.println("Mouse "+getName()+ " is eating.");
    }
    public void sleep(){
        System.out.println("Mouse "+getName()+ " is sleeping.");
    }
    public void showMessage(){
        System.out.println("This is Mouse "+getName()+ ".");
    }
}
