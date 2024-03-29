package javaExerсise.loop;

public class Task78 {
    public static void loop(int[] days, int[] values) {
        int silent = 0;
        int danger = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] == 2 && values[i] <= 5) {
                silent++;
            }
            if (values[i] >= 7) {
                danger++;
            }
        }
        System.out.println(String.format("Опасно: %d, спокойный вторник: %d", danger, silent));
    }
}
