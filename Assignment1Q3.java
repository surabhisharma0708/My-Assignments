import java.util.*;
class SiCi
{
    public double simpleInterest(double principalAmount,int time,double interestRate)
    {
        double si = (principalAmount*time*interestRate)/100;
        return si;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate)
    {
        double ci = (principalAmount*Math.pow((1+interestRate/100),time));
        return ci;
    }
}
public class Assignment1Q3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double r = sc.nextDouble();

        int n = sc.nextInt();
        int t = sc.nextInt();
        SiCi obj = new SiCi();
        System.out.println(obj.simpleInterest(p,n,r));
        System.out.println(obj.compoundInterest(p,t,r));
    }
}
