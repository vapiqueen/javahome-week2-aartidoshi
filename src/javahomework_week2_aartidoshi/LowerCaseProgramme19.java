package javahomework_week2_aartidoshi;

/**Write a Java program to convert a given string into lowercase.
 *Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 *Output: the quick brown fox jumps over the lazy dog.
 */

public class LowerCaseProgramme19 {

    public static void main(String[] args) {
        String str=" THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        System.out.println("Before converting to lower case="+str);
        str=str.toLowerCase();
        System.out.println("After converting to lower case="+str);
        System.out.println(str);
    }
}
