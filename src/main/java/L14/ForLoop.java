package L14;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++)
            System.out.println("Lesson 14");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

class ForLoop2 {
    public static void main(String[] args) {
        int a = 5;
        if (a < 10) {
            for (int i = 1; i <= 30; i++) {
                if (i == 20) {
                    break;
                }
                if (i == 10) {
                    continue;
                }
                System.out.println(i);
            }
        }
    }
}
class ForLoop3 {
    public static void main(String[] args) {
        for (int hour = 0; hour <=23; hour++){//outer loop
           for (int minute = 0; minute < 60; minute++){// inner loop
               System.out.println(hour + ":" + minute);
           }
        }
    }
}