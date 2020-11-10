package ru.geekbrains.lessen3;

import java.util.Random;
import java.util.Scanner;

public class MainApp {

    private static Random random = new Random();

    public static void main(String[] args) {

        //1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
        // При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
        // После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
        //инициализируем сканер
        Scanner scanner = new Scanner(System.in);
        do {
            int numComp = random.nextInt(10);
            System.out.println("Угдай число с 3 попыток от 0 до 9");
            for (int i = 3; i > 0; i--) {
                System.out.println("Введи свой ответ: (для выхода из игры, просто нажмите Enter)");
                int questionNum = scanner.nextInt();
                if (questionNum == numComp) {
                    System.out.println("Вы угадали число, молодец!");
                    break;
                }
                System.out.println(questionNum > numComp ? "Введенное чилсо больше " : "Введенное число меньше ");
                System.out.println((i - 1) > 0 ? " У Вас осталось " + (i - 1) + " попыток." : "Попытки закончились, вы проиграли.");
            }
            System.out.println("Сыграем еще раз? 1 – ДА / 0 – НЕТ");
        }
        while (scanner.nextInt() == 1);
    }
}