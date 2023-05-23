package LambdaExpression;

import java.util.Scanner;

interface operation{
    double performOperation(int n1, int n2);
}
public class Assignment4Q1
{

    public double addition(int num1,int num2)
    {
        operation add = (a,b)-> a+b;
        return add.performOperation(num1,num2);
    }
    public double subtraction(int num1,int num2)
    {
        operation sub = (a,b)-> a-b;
        return sub.performOperation(num1,num2);
    }
    public double multiplication(int num1,int num2)
    {
        operation multi = (a,b)-> a*b;
        return multi.performOperation(num1,num2);
    }
    public double division(int num1,int num2)
    {
        operation divide = (a,b)->a/b;
        return divide.performOperation(num1, num2);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Assignment4Q1 obj = new Assignment4Q1();
        System.out.println(obj.addition(num1,num2));
        System.out.println(obj.subtraction(num1,num2));
        System.out.println(obj.multiplication(num1,num2));
        System.out.println(obj.division(num1,num2));



    }


}
