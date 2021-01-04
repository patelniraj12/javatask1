package com.company;
class cylinder{
    private int hight;
    private int radius;

    public cylinder(int radius,int hight) {
        this.radius = radius;
        this.hight=hight;
    }

    public int getHight() {
        return hight;
    }



    public void setHight(int hight) {
        this.hight = hight;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double surfaceare(){
        return 2*Math.PI*radius*radius + 2*Math.PI*radius*hight;
    }


}
public class exercise4 {
    public static void main(String[] args) {
        cylinder cy=new cylinder(2,3);
//        cy.setHight(2);
//        cy.setRadius(2);
        System.out.println(cy.getHight());
        System.out.println(cy.getRadius());
        System.out.println(cy.surfaceare());


    }
}
