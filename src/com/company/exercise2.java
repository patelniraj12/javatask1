package com.company;
class rectangle{
    int length,width;
    public int area(){
        return length*width;
    }
    public int perimeter(){
        return (2*(length+width));
    }
        }
public class exercise2 {
    public static void main(String[] args) {
        rectangle re= new rectangle();
        re.length=2;
        re.width=2;
        System.out.println(re.area());
        System.out.println(re.perimeter());
    }
}
