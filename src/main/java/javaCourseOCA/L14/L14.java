package javaCourseOCA.L14;

public class L14 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Lesson loop");
        }
        for (int z = 1; z < 11; z++) {
            System.out.println(z);
        }
        for (int x = 4, a = 3, b = 12; x <= b && x >= 4 || b < a; x = x + 2, a = a + 1, method_for_loop(10)) {
//            method_for_loop(10);
            System.out.println(x + " " + a);
        }
    }

    static void method_for_loop(int n) {
        System.out.println(n);
    }
}

class L15 {
    public static void main(String[] args) { // Здесь работает loop с выводом четных чисел до 30
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }

        for (int z = 1; z < 20; z++) {
            if (z == 6) {
                break; // обрывает loop по if
            }
            System.out.println("число до паузы " + z);
        }
        for (int z = 1; z < 10; z++) {
            if (z > 8 || z < 3) {
                z += 5;
                continue; //реализация в обход loop
            }
            System.out.println("variables " + z);
        }
    }
}

class Clock {
    protected static void time() {
        BASIC:
        for (int hour = 0; hour <= 24; hour++) {
            System.out.println("Начало аутер лупа");
            NOT_PRIMARY:
            for (int minute = 0; minute <= 59; minute++) {

                System.out.println(hour + " : " + minute);
                if (minute == 30) {
                    break BASIC;
                }
            }
            System.out.println("Конец интер лупа");
        }
    }

    public static void main(String[] args) {
        Clock Test = new Clock();
        Test.time();
    }
}