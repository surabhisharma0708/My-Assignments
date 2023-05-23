package stringandstringbuffer;

public class StringBufferReverse {
    public static void main(String[] args) {
        String s = "This method returns the reversed object on which it was called";
        StringBuffer sb =  new StringBuffer(s);
        sb.reverse();
        System.out.println(sb);
    }
}
