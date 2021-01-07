package com.company;
import java.util.Random;
import java.util.Scanner;

class game1{
    public int number;
    public int inputUser;
    public int noOfNumber;

    public int getNoOfNumber() {
        return noOfNumber;
    }
    public void setNoOfNumber(int noOfNumber) {
        this.noOfNumber = noOfNumber;
    }

     game1(){
        Random rand= new Random();
       this.number= rand.nextInt(100);
    }

    void takeUserInput(){
        System.out.println("gusse the number");
        Scanner sc=new Scanner(System.in);
        inputUser = sc.nextInt();

    }
    boolean isCorrectNumber(){
        noOfNumber++;
        if (inputUser==number){
            System.out.format("the num of  %d\n it is attemot %d",number,noOfNumber);
            return true;
        }else if(inputUser<number){
            System.out.println("this is small");
        }else if(inputUser>number){
            System.out.println("this is big");
        }
        return false;
    }
}
public class exercise5 {
    public static void main(String[] args) {
        game1 g= new game1();
        boolean b= false;
        while(!b){
            g.takeUserInput();
            b=g.isCorrectNumber();
            System.out.println(b);
        }
    }

}
