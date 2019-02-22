import java.util.*;

public class oddsAndEvens {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Let's play a game called \"Odds and Evens\" ");
        System.out.print("What is your name? ");
        String name = input.next();
        System.out.print("Hi "+ name + ", which do you choose? (O)dds or (E)vens? ");
        String choose = input.next().toUpperCase();
        if ( choose.equals("O")){
            System.out.print(name + " has picked odds! The computer will be evens. ");
        } else {
            System.out.print(name + " has picked evens! The computer will be odds. ");
        }
        System.out.println("\n"+"--------------------------------------");

        System.out.print("How many \"fingers\" do you put out? ");
        int finger = input.nextInt();
        int computerNumber = rand.nextInt(6);
        System.out.print("The computer plays "+ computerNumber + " \"fingers\".");
        System.out.println("\n"+"-------------------------------------");

       System.out.println(finger+" + "+ computerNumber+" = "+ (finger+computerNumber) );
       if ((finger+computerNumber) % 2 == 0){
           System.out.println((finger+computerNumber) + " is ... even!");
       } else {
           System.out.println((finger+computerNumber) + " is ... odd!");

       }
       if (((finger+computerNumber) % 2 == 0 &&  choose.equals("E")) || ((finger+computerNumber) % 2 != 0 && choose.equals("O"))){
           System.out.println("That means "+ name + " wins! :) ");
       }else {
           System.out.println("That means computer wins! ");
           System.out.println("\n"+"-------------------------------------");
       }

    }

}


