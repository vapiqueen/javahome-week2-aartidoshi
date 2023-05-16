package javahomework_week2_aartidoshi;
//Write a Java program to swap two variables.

public class SwapTwoVariablesProgramme15 {

    public static void main(String[] args) {
        int first=30;
        int second=50;
        System.out.println("Before swap");
        System.out.println("First value:"+first);
        System.out.println("Second value"+second);

        int temp = first;
        first = second;
        second = temp;
        System.out.println("After swap");
        System.out.println("First value:"+first);
        System.out.println("Second value"+second);

    }
}
