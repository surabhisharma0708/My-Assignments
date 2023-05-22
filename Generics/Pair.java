package Generics;

import java.util.Date;
import java.util.Scanner;

public class Pair
{
    private String key;
    private Object value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Object getValue()
    {
        return value;
    }

    public void setValue(Object value)
    {
        if(value instanceof String || value instanceof Date)
        {
            this.value = value;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pair obj1 = new Pair();
        obj1.setKey("1");
        obj1.setValue("Hello");
        System.out.println(obj1.getKey()+" "+obj1.getValue());

        Pair obj2 = new Pair();
        obj2.setKey("Today is");
        obj2.setValue(new Date());
        System.out.println(obj2.getKey()+" "+obj2.getValue());
    }
}
