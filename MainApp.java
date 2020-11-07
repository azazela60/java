package ru.geekbrains.lessen2;

public class MainApp {
    public static void main(String[] args) {

        //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        System.out.println("\nЗадание-1");
        int[] mass1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < mass1.length; i++) {
            mass1[i] = mass1[i] == 1 ? 0 : 1;
            System.out.print(mass1[i] + " ");
        }

        //2. Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        System.out.println("\nЗадание-2");
        int[] mass2 = new int[8];
        for (int i = 1, j = 0; i < mass2.length; i++) mass2[i] = j += 3;
        for (int x : mass2) System.out.print(x + " ");

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
        // и числа меньшие 6 умножить на 2;
        System.out.println("\nЗадание-3");
        int[] mass3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < mass3.length; i++) {
            if (mass3[i] < 6) mass3[i] *= 2;
            System.out.print(mass3[i] + " ");
        }

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        System.out.println("\nЗадание-4");
        int[][] mass4 = new int[8][8];
        for (int i = 0; i < mass4.length; i++) {
            for (int j = 0, j2 = mass4[i].length; j <mass4 [i].length; j++, j2--) {
                if (i == j || i == (j2 - 1))mass4 [i][j] = 1;
                System.out.print(mass4[i][j] + " ");
            }
            System.out.print("\n");
        }

        //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        System.out.println("\nЗадание-5");
        int[] mass5 = {10, 5, 13, 2, 11, 4, 5, 2, 0, 8, 9, 3};
        int min = mass5[0], max = mass5[0], indMax = 0, indMin = 0;
        for (int i = 0; i < mass5.length; i++) {
            if (mass5[i] > max) {
                max = mass5[i];
                indMax = i;
            }
            if (mass5[i] < min) {
                min = mass5[i];
                indMin = i;
            }
        }
        System.out.println("Максимальный элемент находится в массиве под индексом " + indMax + " со значением  = " + max);
        System.out.println("Минимальный элемент находится в массиве под индексом " + indMin + " со значением  = " + min);

    }
}





















