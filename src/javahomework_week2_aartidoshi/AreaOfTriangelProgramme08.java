package javahomework_week2_aartidoshi;

//Write a program to calculate the area of a triangle.

import java.util.Scanner;

public class AreaOfTriangelProgramme08 {


    public static void main(String[] args) {
        int a,b,c,sp;
        double area;
        System.out.println("Enter value for area of a Triangel ");
        Scanner r = new Scanner(System.in);
       a = r.nextInt();
       b = r.nextInt();
       c = r.nextInt();

       sp=(a+b+c)/2;

        area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
        System.out.println("Area of Triangle" + area);
}

}
