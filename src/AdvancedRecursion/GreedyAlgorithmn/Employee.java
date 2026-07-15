package AdvancedRecursion.GreedyAlgorithmn;

public class Employee implements Comparable<Employee>{
    public String Name ;
    public double salary  ;
    public int id ;

    public Employee(String name, int id, double salary) {
        Name = name;
        this.id = id;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id ;

    }
}
