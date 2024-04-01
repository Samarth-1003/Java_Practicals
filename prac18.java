class Person{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Employee extends Person{
    int employee_id;
    int salary;

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

public class prac18 {
    public static void main(String args[]) {
        Employee e = new Employee();
//        Person p = new Person();
        e.setName("Fisk");
        System.out.println("Name: " + e.getName());

        e.setAge(22);
        System.out.println("Age: " + e.getAge());

        e.setEmployee_id(123);
        System.out.println("Employee ID: " + e.getEmployee_id());

        e.setSalary(120000);
        System.out.println("Salary:" + e.getSalary());

    }
}
