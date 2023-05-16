package javahomework_week2_aartidoshi;

import java.util.Scanner;

/**Write a Java program that takes a number as input and prints its
 multiplication table up to 10.
 Test Data: Input a number: 8
* Expected Output :
 *8 x 1 = 8
 *8 x 2 = 16
 88 x 3 = 24
 ...
* 8 x 10 = 80

 */
public class MultiplicationTableUpTo10Programmer10 {

    public static void main(String[] args) {
        int num;
        System.out.println("Enter any Number");
        Scanner r=new Scanner(System.in);
        num=r.nextInt();
        for (int i=1; i<=10; i++){
            System.out.println(num+"*"+i+"="+num*i);
        }

    }
}
