package cash;

import java.util.Scanner;

public class converter {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        String choice = welcomeMessage();

        if(choice.equals("GBP")){
            GBP();
        }else{
            USD();
        }

    }


    public static String welcomeMessage(){
        String choice = "" ;

        System.out.println("Welcome to the currency converter.");
        System.out.println("Please type USD to convert from GBP to USD | Or press GBP to convert from USD to GBP:");
        choice = scanner.next();

        while(true) {
            if (choice.equals("USD") || choice.equals("GBP")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter either USD or GBP.");
            }
        }
        return choice;
    }

    private static void GBP() {
        System.out.println("1");
    }

    private static void USD() {
        System.out.println("2");
    }


}
