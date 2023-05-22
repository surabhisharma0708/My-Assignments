package BasicDS;

import java.util.Scanner;
class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks)
    {
        if((subject1Marks>60 || subject2Marks>60 || subject3Marks>60) || subject1Marks+subject2Marks+subject3Marks<60)
        {
            System.out.println("failed");
            return "";
        }
        if(subject1Marks+subject2Marks+subject3Marks>60)
        {
            System.out.println("passed");
        }
        if(subject1Marks+subject2Marks>60 || subject2Marks+subject3Marks>60 || subject1Marks+subject3Marks>60)
        {
            System.out.println("promoted");
        }

        return "";
    }
}
public class Assignment1Q4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one=sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();
        ResultDeclaration obj = new ResultDeclaration();
        System.out.println(obj.declareResults(one, two, three));
    }
}
