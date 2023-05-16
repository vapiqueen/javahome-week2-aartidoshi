package javahomework_week2_aartidoshi;

/** Write a Java programme using the following steps.
 *1.1 Declare two instance variables.
 *1.2 Declare one instance method.
 *1.3 Call both instance variables into the instance method inside the print statement.
 *1.4 Declare the Main method.
 *1.5 Call the above instance method into the Main method and Run the programme.
 */

public class InstanceVariablesProgramme01 {
    int a=10;
    int b=20;
    public static void main(String[] args) {
        InstanceVariablesProgramme01 m1 = new InstanceVariablesProgramme01();
        System.out.println(m1.a);
        System.out.println(m1.b);
    }
    public void m1() {
        System.out.println(a);
        System.out.println(b);
    }

}
