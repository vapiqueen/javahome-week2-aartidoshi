package javahomework_week2_aartidoshi;
/**Write a program to insert any temperature value in degree Fahrenheit and
 convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

import java.util.Scanner;

public class TemperatureValueProgramme07 {
    public static void main(String[] args) {
        float FahrenheitValue;
        float celciusValue;

        //User Input Logic using Scanner class
        Scanner s1 = new Scanner(System.in);
        System.out.println("\n Enter Fahrenheit Value: ");
        FahrenheitValue= s1.nextFloat();

        //Logic to conver Fahrenheit to Celsius
        celciusValue =(( FahrenheitValue - 32) *5) /9;

        System.out.println("\n Result Celsius Value is: "+celciusValue);
    }
}
