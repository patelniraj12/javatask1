package com.company;

class Employees{
    int id;
    String name;

    public void printDetail() {
        System.out.println("my id is" + id);
        System.out.println("my name is" + name);
    }
}
public class task1 {
    public static void main(String[] args) {
        Employees niraj =new Employees();
        Employees jay =new Employees();
        niraj.id=1;
        niraj.name="Niraj Mulani";
        jay.id=2;
        jay.name="jay suhagiya";
        niraj.printDetail();
        jay.printDetail();


    }
}
