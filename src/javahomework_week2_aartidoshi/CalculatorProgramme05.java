package javahomework_week2_aartidoshi;

import java.util.Scanner;


/**Write a program for a calculator with addition, subtraction, multiplication
 and division methods all with parameters and use string concatenation
 methods.(Note: Two static and Two instance methods.)
 */

public class CalculatorProgramme05 {


    public static void main(String[] args) {
        int a,b;
        CalculatorProgramme05 p5 = new CalculatorProgramme05();
        CalculatorProgramme05 p6 =new CalculatorProgramme05();


        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter First value of a:");
        a = s1.nextInt();
        System.out.println("Enter Second value of b:");
        b = s1.nextInt();

        addition(a, b);
        subtraction(a, b);
        p5.multiplication(a, b);
        p6.division(a, b);



    }

        public static void addition(int a, int b) {
            System.out.println("Addition of " + a +" + " + b + "  = " + (a + b));

        }

        public static void subtraction(int a, int b) {
            System.out.println("Subtraction of " + a + " - " + b + " = " + ( a-b));

        }
        public  void multiplication (int a,int b) {
        CalculatorProgramme05 p5= new CalculatorProgramme05();
            System.out.println("Multiplication of " + a + " * " + b + " = " + (a * b));

        }
         public void division(float a , float b) {
             CalculatorProgramme05 p6= new CalculatorProgramme05();
             System.out.println("Division of " + a + " / " + b + " = " + (a / b));
         }

}

