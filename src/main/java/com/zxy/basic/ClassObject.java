package com.zxy.basic;

public class ClassObject {
    private Integer id;
    private String name;
    private String desc;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ClassObject(Integer id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public ClassObject() {}

    public void showArgs() {
        System.out.println("id:"+id);
        System.out.println("name:"+name);
        System.out.println("desc:"+desc);
    }
}
