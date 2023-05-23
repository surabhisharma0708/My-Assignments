package stringandstringbuffer;
import java.util.*;
public class StringJoin
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println("After joining two strings "+String.join(" ",s1,s2));
    }
}
