package com.zxy.basic;

public class BasicTest {
    public static void main(String[] args) {
        System.out.println("测试注释");
        Comment commentTest = new Comment();
        commentTest.showMsg();
        System.out.println("-----------------------------------------------------------");
        System.out.println("测试类和对象");
        System.out.println("无参构造函数");
        ClassObject classObjectTest1 = new ClassObject();
        classObjectTest1.showArgs();
        System.out.println("全参构造函数");
        ClassObject classObjectTest2 = new ClassObject(1,"testName","testDesc");
        classObjectTest2.showArgs();
        System.out.println("修改变量值");
        classObjectTest2.setId(111);
        classObjectTest2.setName("testName111");
        classObjectTest2.setDesc("testDesc111");
        classObjectTest2.showArgs();
        System.out.println("-----------------------------------------------------------");
        System.out.println("测试while");
        While whileTest = new While();
        whileTest.doWhile();
        System.out.println("-----------------------------------------------------------");
        System.out.println("测试for");
        For forTest = new For();
        forTest.doFor();
        System.out.println("-----------------------------------------------------------");
        System.out.println("测试do-while");
        DoWhile doWhileTest = new DoWhile();
        doWhileTest.doDoWhile();
        System.out.println("-----------------------------------------------------------");
        System.out.println("测试break");
        Break breakTest = new Break();
        breakTest.doBreak();
        System.out.println("-----------------------------------------------------------");
        System.out.println("测试continue");
        Continue continueTest = new Continue();
        continueTest.doContinue();
        System.out.println("-----------------------------------------------------------");
        System.out.println("测试if-else");
        IfElse ifElseTest = new IfElse();
        ifElseTest.doIfElse();
        System.out.println("------------------------------------------------------------");
        System.out.println("switch测试");
        SwitchCase switchCaseTest = new SwitchCase();
        switchCaseTest.doSwitchCase();
        System.out.println("-----------------------------------------------------------");
    }
}