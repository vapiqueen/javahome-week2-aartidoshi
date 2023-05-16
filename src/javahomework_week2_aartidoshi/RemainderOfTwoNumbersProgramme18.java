package javahomework_week2_aartidoshi;
/**Write a Java program to print the sum (addition), multiply, subtract, divide and
 remainder of two numbers.
 Test Data:
 Input first number: 125
 Input second number: 24
 Expected Output :
 125 + 24 = 149
 125 - 24 = 101
 125 x 24 = 3000
 125 / 24 = 5
 125 mod 24 = 5
 */


import java.util.Scanner;

public class RemainderOfTwoNumbersProgramme18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2,result;
        System.out.println("Enter two number :");
        num1= sc.nextInt();
        num2=sc.nextInt();

        int sum,sub,mult,div,rem;
        sum=num1+num2;
        sub=num1-num2;
        mult=num1*num2;
        div=num1/num2;
        rem=num1%num2;

        System.out.println(num1 + " + "+ num2 + " = "+ sum);
        System.out.println(num1 +" - "+ num2 + " = "+sub);
        System.out.println(num1 +" * "+ num2 +" = " +mult);
        System.out.println(num1 +" / "+ num2 +" = " +div);
        System.out.println(num1 +" % "+ num2 + " = "+ rem);
    }

}
