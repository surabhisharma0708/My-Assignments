package Generics;

public class Employee
{
    private int id;
    private String name;
    private int salary;
    private String department;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String displayDetails()
    {
        return "id: "+getId() +" name: "+getName()+" salary: "+getSalary()+" department: "+getDepartment();
    }
}
