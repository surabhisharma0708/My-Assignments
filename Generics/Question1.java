package Generics;
import java.util.*;
import java.util.HashSet;
import java.util.Set;
public class Question1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        HashSet<Employee> set = new HashSet<>();
        Employee employee = new Employee();
        employee.setId(sc.nextInt());
        employee.setName(sc.next());
        employee.setSalary(sc.nextInt());
        employee.setDepartment(sc.next());
        set.add(employee);
        String s = employee.displayDetails();
        System.out.println(s);
    }
}


