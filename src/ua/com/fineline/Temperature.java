package ua.com.fineline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Temperature {
    public static void main(String[] args) throws IOException {
        boolean isOut = true;
        System.out.print("Enter the temperature in Fahrenheit:\t");

        do {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int fahrenheit = Integer.parseInt(br.readLine());
            if(fahrenheit<=(float)-459.67){
                System.out.println("\n\tTemperature out of absolute zero!");
            }
            else if (fahrenheit>=9980) {
                System.out.println("\n\tYou walking on SUN... It's hotter than Jessica Alba in steam room?");
            }
            else {
                float celsius = (fahrenheit - (float) 32) * (float) 5 / (float) 9;
                System.out.printf("\n\tTemperature in Celsius is: %,.2f", celsius);
            }
            System.out.print("\n\n\tDo you want continue?");
            System.out.print("\n\t1 - CONTINUE\t2 - EXIT\n\n\t ");
            char choice = (char)br.read();

            if (choice == '1'){
                System.out.print("\n\tEnter the temperature in Fahrenheit:\t");
            }
            else if (choice == '2'){
                System.out.println("\tThank you! Bye!");
                isOut = false;
            }
            else {System.out.println("\tWrong enter it's your choice! We don't like you! Goodbye!");
                isOut = false;
            }
        }
        while (isOut);
    }
}