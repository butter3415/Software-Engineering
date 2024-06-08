package week08.study.factoryPattern_Pizza_fm;

import java.util.ArrayList;

public abstract class Pizza {

    public void prepare(){
        System.out.println("준비 중~");
    }
    public void bake(){
        System.out.println("굽는 중~");
    }

    public void cut(){
        System.out.println("커팅 중~");
    }

    public void box(){
        System.out.println("포장 중~");
    }

}
