package cash;

import java.util.Scanner;
import javax.swing.JOptionPane;



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
        String choice = JOptionPane.showInputDialog(
                "<html>Welcome to the currency converter.<br>" +
                        "Please type 'USD' to convert from GBP to USD or type 'GBP' to convert from USD to GBP:</html>"
        );

        while(true) {
            if (choice.equals("USD") || choice.equals("GBP") || choice.equals("usd") || choice.equals("gbp")) {
                break;
            } else {
                choice = JOptionPane.showInputDialog("<html>Invalid input.<br>"+ "Please type 'USD' to convert from GBP to USD or type 'GBP' to convert from USD to GBP</html>");
            }
        }
        return choice;
    }

    private static void GBP() {
        String amountString = JOptionPane.showInputDialog("Enter the amount of USD you want to convert to GBP:");
        double amount = Integer.parseInt(amountString);
        double pounds = amount / 1.28;
        System.out.println(pounds);
    }

    private static void USD() {
        String amountString = JOptionPane.showInputDialog("Enter the amount of GBP you want to convert to USD:");
        int amount = Integer.parseInt(amountString);
        double dollars;
        dollars = amount * 1.28;
        System.out.println(dollars);
    }


}
