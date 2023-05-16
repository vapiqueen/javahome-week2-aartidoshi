package javahomework_week2_aartidoshi;

import java.util.Scanner;

/**Write a Java program to print the area and perimeter of a rectangle.

 *Test Data:
 *Width = 5.5 Height = 8.5

 *Expected Output:

 *Area is 5.6 * 8.5 = 47.60
 *Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

public class AreaAndPerimeterOfRectangleProgramme14 {
    public static void main(String[] args) {

        double w,h,a,p;

        Scanner input =new Scanner(System.in);
        System.out.println("Enter width");
        w = input.nextDouble();
        System.out.println("Enter heigth");
        h = input.nextDouble();
        a=w*h;
        p=2 * (w + h );
        System.out.println("Area = " + a);
        System.out.println("Perimeter = " + p);
    }

}
