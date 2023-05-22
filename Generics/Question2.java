package Generics;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class Question2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Double> map = new HashMap<>();
        int i=0;
        while(i!=10)
        {
            int key = (int)(Math.random()*100);
            double value = Math.random()*100;
            map.put(key,value);
            if(!map.containsKey(key))
            {
               i++;
            }

        }
        System.out.println(map);
    }
}
