package Employees;
public abstract class Employee {
    private String name;
    private double baseSalary;
    private int workingHours;

    public Employee(String name, double baseSalary, int workingHours){
        this.name = name;
        this.baseSalary = baseSalary;
        this.workingHours = workingHours;
    } 

    public abstract double calculateSalary();

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public int getWorkingHours(){
        return workingHours;
    }
    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
}
