package dsf;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваш рост в см (от 150 до 180): ");
        int rost = sc.nextInt();
        if (rost < 150 || rost > 180) {
            System.out.println("Ошибка: рост должен быть в диапазоне от 150 до 180 см.");
            return;
        }
        System.out.print("Введите ваш вес в кг: ");
        int wes = sc.nextInt();

        double rostInMeters = rost / 100.0;
        double bmi = wes / (rostInMeters * rostInMeters);

        System.out.printf("Ваш ИМТ: %.2f%n", bmi);

        if (rost < 60) {
            System.out.println("Дефицит массы тела.");
        } else if (wes >= 60 && wes <= 80) {
            System.out.println("Норма.");
        } else if (wes >= 81 && wes <= 99) {
            System.out.println("Избыточная масса тела (предожирение).");
        } else {
            System.out.println("Ожирение.");
        }
    }
}
