import java.util.Scanner;

class Student {
    int StudentID;
    String name;

    int mark1;
    int mark2;
    int mark3;

    public void setdata(){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Your Student ID:");
        StudentID = s.nextInt();

        System.out.println("Enter Your Name:");
        name = s.nextLine();

        System.out.println("Enter Mark1:");
        mark1 = s.nextInt();

        System.out.println("Enter Your Mark2:");
        mark2 = s.nextInt();

        System.out.println("Enter Your Mark3:");
        mark3 = s.nextInt();

    }

    public void displaydata(){
        System.out.println("Student ID :" + StudentID);
        System.out.println("Name: " + name);
        System.out.println("Mark1: " + mark1);
        System.out.println("Mark2: " + mark2);
        System.out.println("Mark3: " + mark3);
    }


}

public class prac17 {
    public static void main (String [] args){
        Student s1 = new Student();
        s1.setdata();
        s1.displaydata();

    }

}
