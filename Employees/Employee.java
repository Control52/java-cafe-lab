package Employees;
public abstract class Employee {
    String name;
    double baseSalary;
    int workingHours;


    public Employee(String name, double baseSalary, int workingHours){
        this.name = name;
        this.baseSalary = baseSalary;
        this.workingHours = workingHours;
    } 


    public abstract double calculateSalary();

    public String getName(){
        return name;
    }
    
    public double getBaseSalary(){
        return baseSalary;
    }

    public int getWorkingHours(){
        return workingHours;
    }
}
