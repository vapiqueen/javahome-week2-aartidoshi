package javahomework_week2_aartidoshi;

/**. Write a Java programme using the following steps.
 *3.1 Declare one instance and one static variable.
 *3.2 Declare one instance method.
 *3.3 Declare one static method.
 *3.4 Call both instance and static variables into both instance and static methods inside the
 print statement.
 *3.5 Declare the Main method.
 *3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class InstanceAndStaticVariableProgramme03 {

    int a=5;
    static int b=20;

    public static void main(String[] args) {
        InstanceAndStaticVariableProgramme03 obj=new InstanceAndStaticVariableProgramme03();
                obj.m3();
                m4();

        }
        public void m3(){
        InstanceAndStaticVariableProgramme03 m3=new InstanceAndStaticVariableProgramme03();
        System.out.println(m3.a);
        System.out.println(b);


    }
    public static void m4(){
        InstanceAndStaticVariableProgramme03 m4=new InstanceAndStaticVariableProgramme03();
        System.out.println(m4.a);
        System.out.println(b);


    }


}
