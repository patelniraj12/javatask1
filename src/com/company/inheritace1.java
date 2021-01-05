package com.company;
class x{
    public int x;
    public void math1(){
        System.out.println("type m1");
    }
}
class y extends x{
    public int y;
    public void math2(){
        System.out.println("type m2");
    }
}
public class inheritace1 {
    public static void main(String[] args) {
        x a=new x();
        y b=new y();
        b.math2();
        a.math1();
        b.math1();

    }
}
