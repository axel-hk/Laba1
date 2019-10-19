package com.company;
import java.util.Scanner;
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Arrays A = new Arrays();
        System.out.println("Введите количество элементов массива: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        short[] array = new short[n];
        A.enter(n, array);
        A.out(array);
        System.out.println("Хотите увеличить размер массива ?: Да: 1, Нет: 2 ");
        Scanner st = new Scanner(System.in);
        int str = st.nextInt();
        switch(str) {
            case 1:
                System.out.println("Насколько элемнтов увеличить предыдущий массив: ");
                new Scanner(System.in);
                int a = sc.nextInt();
                short[] arrayNew = new short[n + a];
                A.newarr(n, a, arrayNew, array);
                A.out(arrayNew);
                break;
            case 2:
                System.out.println("Ну, как хотите!");
        }

        System.out.println("Отсортированный массив: ");
        A.insertion(array);
        A.out(array);
    }
}
