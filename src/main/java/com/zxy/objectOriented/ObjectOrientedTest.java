package com.zxy.objectOriented;

public class ObjectOrientedTest {
    public static void main(String[] args) {
        Mouse mouse = new Mouse("mouse1",1);
        mouse.testOverride();
        mouse.testOverload("msg1","msg2");
        mouse.eat();
        mouse.sleep();
        mouse.showMessage();
        Penguin penguin = new Penguin("penguin1",1);
        penguin.testOverload("msg");
        penguin.testOverride();
        penguin.eat();
        penguin.sleep();
        penguin.showMessage();
    }
}
