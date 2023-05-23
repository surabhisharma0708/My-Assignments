package stringandstringbuffer;

public class StringOperation
{
    public static void main(String args[])
    {
        String s = "Java String pool refers to collection of Strings which are stored in heap memory";
        System.out.println("String in uppercase"+s.toUpperCase());
        System.out.println("String in lowercase"+s.toLowerCase());
        System.out.println("Replace string character"+s.replace('a','$'));
        System.out.println("String contains method "+ s.contains("collection"));
        System.out.println(s);
        System.out.println("String equals method "+s.equals("java string pool refers to collection of strings which are stored in heap memory"));
        System.out.println("String equals method "+s.toLowerCase().equals("java string pool refers to collection of strings which are stored in heap memory"));
    }
}
