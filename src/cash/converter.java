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
            if (choice.equals("USD") || choice.equals("GBP")) {
                break;
            } else {
                choice = JOptionPane.showInputDialog("<html>Invalid input.<br>"+ "Please type 'USD' to convert from GBP to USD or type 'GBP' to convert from USD to GBP</html>");
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
