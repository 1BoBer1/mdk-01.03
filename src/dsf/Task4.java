package dsf;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] arr3 = new double[7];
        double summa = 0;

        System.out.println("Введите ежедневные затраты за неделю:");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print("День " + (i + 1) + ": ");
            arr3[i] = scanner.nextDouble();
            summa += arr3[i];
        }

        System.out.printf("₽:%.2f ", summa);
        System.out.println();
        System.out.printf("\n$:%.2f ", summa / 98.05);
        System.out.printf("\n€:%.2f ", summa / 105.2);
    }
}