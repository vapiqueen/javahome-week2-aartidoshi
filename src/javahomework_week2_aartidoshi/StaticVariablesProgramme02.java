package javahomework_week2_aartidoshi;

/**Write a Java programme using the following steps.
 2.1 Declare two static variables
 2.2 Declare one static method
 2.3 Call both static variables into the static method inside the print statement.
 2.4 Declare the Main method.
 2.5 Call the static method into the Main method and Run the programme
 */

public class StaticVariablesProgramme02 {
    static int a=10;
    static int b=30;

    public static void main(String[] args) {
        m2();

    }
    public  static void m2(){
        System.out.println(a);
        System.out.println(b);

    }
}
