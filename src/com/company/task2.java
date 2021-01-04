package com.company;
class worker{
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public void setName( String n){
        name=n;
    }
    public int getId(){
        return id;
    }
    public void setId( int i){
        id=i;
    }
}
public class task2 {
    public static void main(String[] args) {
        worker niraj= new worker();
        niraj.setName("niraj mulani");
        System.out.println(niraj.getName());
        niraj.setId(1);
        System.out.println(niraj.getId());

    }
}
