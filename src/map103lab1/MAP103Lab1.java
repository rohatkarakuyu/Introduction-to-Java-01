
package map103lab1;

import java.util.Scanner;

public class MAP103Lab1 { // convertion of fahrenheit to celcius and vise versa

    public static void main(String[] args) {
        double F, Celcius;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of temperature in degree celcius: ");
        F = in.nextDouble();
        Celcius = F + 32; 
        System.out.printf(F+" °C = %.1f °F\n", Celcius);
     
    }
}