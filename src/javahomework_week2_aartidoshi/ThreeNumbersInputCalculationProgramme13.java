package javahomework_week2_aartidoshi;
// Write a Java program to swap two variables.


import java.util.Scanner;

public class ThreeNumbersInputCalculationProgramme13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double x = in.nextDouble();
        System.out.println("Enter the second number:");
        double y = in.nextDouble();
        System.out.println("Enter the third number");
        double z = in.nextDouble();
        System.out.println("The average value is:" + average(x,y,z) +"\n");
    }
    public static double average(double x,double y,double z){
        return(x+y+z)/3;
    }



}
