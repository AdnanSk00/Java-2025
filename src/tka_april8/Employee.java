package tka_april8;

public class Employee {
	int id;
    String name;
    float basicSalary;
    float grossSalary;

    void setDetails(int id, String name, float basicSalary){
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void setGrossSalary(){
        this.grossSalary = this.basicSalary + this.basicSalary*10/100 + this.basicSalary*15/100;
    }

    void update(int basicSalary){ 
        this.grossSalary = basicSalary;
    }

    void display(){
        this.setGrossSalary();
        System.out.println("id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Gross Salary: " + grossSalary);
    }
}
