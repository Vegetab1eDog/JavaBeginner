package com.zxy.basic;

public class Break {
    public void doBreak(){
        int [] numbers = {10, 20, 30, 40, 50};
        for(int x : numbers ) {
            // x 等于 30 时跳出循环
            if( x == 30 ) {
                break;
            }
            System.out.print( x );
            System.out.print("\n");
        }
    }
}
