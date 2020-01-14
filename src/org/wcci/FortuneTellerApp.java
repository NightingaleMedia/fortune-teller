package org.wcci;

import java.util.Scanner;

public class FortuneTellerApp {

    public static void main(String[] args) {
        // Asks for First Name
        System.out.println("What is your first name?");
        Scanner input;
        input = new Scanner(System.in);
        String firstName = input.nextLine();


        // Asks for last name
        System.out.println("What is your last name?");
        String lastName = input.nextLine();


        // Asks for age
        System.out.println("What is your age?");
        int age = input.nextInt();


        //Akss for birth month
        System.out.println("what is your birth month?");
        int birthMonth = input.nextInt();

        input.nextLine();
        // roygbiv
        System.out.println("what is your favorite color (you can ask for help if you need it)");
        String favColor = input.nextLine();
        if (favColor.equalsIgnoreCase("HELP")) {
            System.out.println("use RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO or VIOLET");
            System.out.println("what is your favorite color (you can ask for help if you need it)");
            favColor = input.nextLine();
        }

        //siblings
        System.out.println("how many siblings do you have?");
        int numSiblings = input.nextInt();

        input.nextLine();

        //PART 2
        // Determine years until retirement

        int numYearsUntilRetirement = 0;
        if (age % 2 == 0) {
            numYearsUntilRetirement = 24;
        } else {
            numYearsUntilRetirement = 17;
        }



        String vacationHomeLocation = "";
        if (numSiblings == 0) {
            vacationHomeLocation = "Boca Raton";
        } else if (numSiblings == 1){
            vacationHomeLocation = "Ponta Negra";
        } else if (numSiblings == 2){
            vacationHomeLocation = "Portland";
        } else if (numSiblings > 3) {
            vacationHomeLocation = "Baton Rouge";
        } else {
            vacationHomeLocation = "Chernobyl";
        }


        String modeOfTransportation = "";

        switch (favColor.toUpperCase()){
            case "RED": modeOfTransportation = "Maserati";
                break;
            case "YELLOw": modeOfTransportation = "Stallion";
                break;
            case "ORANGE": modeOfTransportation = "Mustang";
                break;
            case "GREEN": modeOfTransportation = "Diablo";
                break;
            case "BLUE": modeOfTransportation = "Truck";
                break;
            case "INDIGO": modeOfTransportation = "Subaru";
                break;
            case "VIOLET": modeOfTransportation = "Civic";
                break;
            default: modeOfTransportation = "Jet Races";

        }


        double bankBalance = 0.0;

        if(birthMonth >= 1 && birthMonth <= 4){
            bankBalance = 5000000.02;

        } else if (birthMonth >=5 && birthMonth >8){
            bankBalance = 250000.45;
        } else if (birthMonth >= 9 && birthMonth<=12){
            bankBalance = 5000000.25;
        } else {
            bankBalance = -500050.0;
        }
        System.out.println(firstName + " " + lastName + " will retire in \n" +
              numYearsUntilRetirement +  " wit h" + bankBalance +  " in the bank, a vacation home in \n"
                + vacationHomeLocation + ", and travel by " +  modeOfTransportation + ".");

    }
}
