package L23;

public class L23 {
}

class Employee {

    double salary;
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("Есть");
    }

    void sleep() {
        System.out.println("Спать");
    }
}

class Teacher extends Employee {
    int amount_student;

    void teach() {
        System.out.println("Учить");
    }

}