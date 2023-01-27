
package pay;

import java.util.Scanner;
 
public class Pay {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        double rate;
        double pay;
        double hour;
        
        System.out.print("How many hours did you work? ");
        hour = keyboard.nextDouble();
        
        System.out.print("How much are you paid per hour? ");
        rate = keyboard.nextDouble();
        
        if(hour <= 40)
        pay = hour * rate;
        else
        pay = (hour - 40) * (1.5 * rate) + 40 * rate;

       System.out.println("You earned $" + pay);

        




        
    }
    
}
