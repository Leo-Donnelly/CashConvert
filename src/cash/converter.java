package cash;

import java.util.Scanner;
import javax.swing.JOptionPane;



public class converter {

    public static void main(String[] args){

        String choice = welcomeMessage();

        if(choice.equals("GBP") || choice.equals("gbp")){
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
        double dollarAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount of USD you want to convert to GBP:"));
        double pounds = dollarAmount / 1.28;
        JOptionPane.showMessageDialog(null, dollarAmount + " USD = " + String.format("%.2f", pounds) + " GBP");
    }

    private static void USD() {
        double poundAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount of GBP you want to convert to USD:"));
        double dollars = poundAmount * 1.28;
        JOptionPane.showMessageDialog(null, poundAmount + " GBP = " + String.format("%.2f", dollars) + " USD");
    }


}
