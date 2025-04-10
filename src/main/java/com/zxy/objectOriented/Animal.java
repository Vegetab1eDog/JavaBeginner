package com.zxy.objectOriented;

public class Animal {
    private String name;
    private int id;
    public Animal(String myName, int id) {
        name = myName;
        this.id = id;
    }

    public void testOverride(){
        System.out.println("This is Animal's testOverride.");
    }

    public void testOverload(){
        System.out.println("This is Animal's testOverload with no args.");
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public int getId() {
        return this.id;
    }

}
