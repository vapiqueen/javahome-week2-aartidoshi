package javahomework_week2_aartidoshi;
/**Write a Java program to add two binary numbers.

* Input Data:
 *Input first binary number: 10
 *Input second binary number: 11
 *Expected Output:
 *Sum of two binary numbers: 101
 */

import java.util.Scanner;

public class TwoBinaryNumbersProgramme16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Binary number :");
        String x=sc.next();
        System.out.println("Enter the second Binary number :");
        String y=sc.next();

        int n1=Integer.parseInt(x,2);
        int n2=Integer.parseInt(y, 2);
        int n3=n1+n2;

        System.out.println("n1 :"+Integer.toBinaryString(n1));
        System.out.println("n2 :"+Integer.toBinaryString(n2));
        System.out.println("n3=n1+n2 : "+ Integer.toBinaryString(n3));



    }
}
