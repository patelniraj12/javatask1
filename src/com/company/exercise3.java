package com.company;

class  game{
    public void walk(){
        System.out.println("walk the player1");
    }public void run(){
        System.out.println("run the player1");
    }public void drive(){
        System.out.println("drive the player1");
    }

}
public class exercise3 {
    public static void main(String[] args) {
        game player=new game();
        player.drive();
        player.run();
        player.walk();



    }
}
