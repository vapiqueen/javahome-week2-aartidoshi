package javahomework_week2_aartidoshi;
//Write a program to convert the upper case to lower case.

import java.util.Scanner;

public class ConvertUpperToLowerCaseProgramme09 {

    public static void main(String[] args) {
        char ch,ch2;
        System.out.println("Enter Character");
        Scanner r = new Scanner(System.in);
        ch = r.next().charAt(0);

        if (ch>= 'A' && ch<= 'z') {
            ch2 = Character.toLowerCase(ch);
            System.out.println("Lowercase "+ ch2);
        }
        else {
            ch2 = Character.toUpperCase(ch);
            System.out.println("Uppercase "+ ch2);

        }
    }
}
