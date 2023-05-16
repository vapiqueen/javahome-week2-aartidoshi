package javahomework_week2_aartidoshi;

/**Write a Java programme using the following steps.
 *4.1 Declare two instance and two static variables.
 *4.2 Declare one instance method.
 *4.3 Declare one static method.
 *4.4 Call all four instance and static variables into both instance and static methods inside the
 print statement.
 *4.5 Declare the Main method.
 *4.6 Call both instance and static methods into the Main method and run the programme
 */

public class StaticAndInstanceVariableProgramme04 {
    static int a = 20;
    static int b=10;

    int c=30;
    int d = 40;

    public static void main(String[] args) {
        StaticAndInstanceVariableProgramme04 obj= new StaticAndInstanceVariableProgramme04();
        m5();
        obj.m6();


    }

    public static void m5(){
        StaticAndInstanceVariableProgramme04 m5=new StaticAndInstanceVariableProgramme04();
        System.out.println(a);
        System.out.println(b);
        System.out.println(m5.c);
        System.out.println(m5.d);

    }
    public void m6(){
        StaticAndInstanceVariableProgramme04 m6=new StaticAndInstanceVariableProgramme04();
        System.out.println(m6.a);
        System.out.println(m6.b);
        System.out.println(c);
        System.out.println(d);
    }

}






