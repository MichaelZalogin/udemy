package javaCourseOCA.L20;

import java.util.*;

import javaCourseOCA.L9.Car;
import javaCourseOCA.L4.Student3;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add("Привет");
        Car car1 = new Car("Red", "V8");
        list1.add(car1);
        Student3 student1 = new Student3(23, "Ivan", "Petrov");
        list1.add(student1);
        list1.add(new StringBuilder("Hello"));
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Hello");
        ArrayList<Student3> list3 = new ArrayList<>();
        for (Object a : list1) {
            System.out.println(a);
        }
        ArrayList<StringBuilder> list5 = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("privet");
        StringBuilder sb2 = new StringBuilder("poka");
        StringBuilder sb3 = new StringBuilder("ok");
        StringBuilder sb4 = new StringBuilder("no");
        list5.add(sb1);
        list5.add(sb2);
        list5.add(sb3);
        list5.add(sb4);

        for (int i = 0; i < list5.size(); i++) {
            list5.get(i).append("!!!");
        }
        for (StringBuilder a : list5) {
            System.out.print(a + " ");
        }
    }
}