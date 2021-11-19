package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("Would you like to check a raffle ticket (C) or purchase a raffle ticket (P)?");
        String option = userInput();
        switch (option) {
            case "P":
               purchaseTicket();
               randTickNum();
               break;



        }
    }
    public static Integer randTickNum() {
        Random random = new Random();
        int randTickNum = random.nextInt(200);
        System.out.println(randTickNum);
        return randTickNum;
    }

    public static Integer purchaseTicket() {
        System.out.println("How many raffle tickets would you like to buy?");
        int numTickets = Integer.parseInt(userInput());
        return numTickets;
    }

    public static String userInput() {
        String userInput = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            userInput = bufferedReader.readLine();
        } catch (Exception e) {
            System.out.println("Error in user input method" + e);
        }
        return userInput;
    }
}
