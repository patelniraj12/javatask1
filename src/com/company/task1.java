package com.company;

class Employees{
    int id;
    String name;
    int salary;

    public void printDetail() {
        System.out.println("my id is " + id);
        System.out.println("my name is " + name);
        System.out.println("my salary is " + salary);
    }
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name= n;
    }

}
 class mobile {
    public void message(){
         System.out.println("mess with friend");
     }
     public void call() {
         System.out.println("call with friend");
     }
 }


public class task1 {
    public static void main(String[] args) {
        Employees niraj =new Employees();
        niraj.setName("Niraj Mulani");
        System.out.println(niraj.getName());
        Employees jay =new Employees();
        jay.setName("jay suhagiya");
        System.out.println(jay.getName());
        niraj.salary=1500;
        System.out.println(niraj.getSalary());
        jay.salary=1500;
        System.out.println(jay.getSalary());


        niraj.id=1;
        niraj.name="Niraj Mulani";
        niraj.salary=15000;
        jay.id=2;
        jay.name="jay suhagiya";
        jay.salary=10000;
        niraj.printDetail();
        jay.printDetail();

        mobile apple= new mobile();
        apple.call();
        apple.message();






    }
}
