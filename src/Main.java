import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ \"Массивы 2\"\n");

        //Задача 1
        System.out.println("Задача 1");
        int[] credits = {15478, 25459, 25412, 18242, 12546};
        int total = 0;
        for (int i = 0; i < credits.length; i++) {
            total = total + credits[i];
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей\n");

        //Задача 2
        System.out.println("Задача 2");
        int minCredit = credits[0];
        int maxCredit = credits[0];
        for (int i = 1; i < credits.length; i++) {
            if (credits[i] < minCredit) {
                minCredit = credits[i];
            }
            if (credits[i] > maxCredit) {
                maxCredit = credits[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minCredit + " рублей. Максимальная сумма трат за неделю составила " + maxCredit + " рублей\n");

        //Задача 3
        System.out.println("Задача 3");
        total = 0;
        double average;
        for (int i = 0; i < credits.length; i++) {
            total = total + credits[i];
        }
        average = (double) total / credits.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей\n");

        //Задача 4
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char currentChar;
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            currentChar = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = currentChar;
        }
        System.out.println(reverseFullName);
    }
}