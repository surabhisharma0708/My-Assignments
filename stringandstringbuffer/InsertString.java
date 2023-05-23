package stringandstringbuffer;

public class InsertString
{
    public static void main(String[] args)
    {
        String original = "“It is used to _ at the specified index position";
        String inserted = "insert text";
        int x = original.indexOf("_");
        System.out.println(x);

        if(x>0)
        {
            String s = original.substring(0,x)+inserted+original.substring(x+1,original.length());
            System.out.println(s);
        }
        else
        {
            String s = "Not found";
            System.out.println(s);
        }
    }
}
