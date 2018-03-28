package stringNdNubers;

public class Employee {
    String name;
    int age;
    public Employee(String n, int a){
        this.name = n;
        this.age = a;
    }
    @Override
    public String toString(){
        return "Employee{"+ "Name:" + " " + name + "," + " " + "Age:" + " " + age + "}";

    }
}
