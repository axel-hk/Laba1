package com.company;

import java.util.Scanner;

public class Arrays {
    public Arrays() {
    }

    public void enter(int n, short[] array) {
        System.out.println("Введите способ ввода: 1 - рандом, 2 - ручной ");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int i;
        switch(x) {
            case 1:
                for(i = 0; i < n; ++i) {
                    array[i] = (short)((int)(-255.0D + Math.random() * 255.0D));
                }

                return;
            case 2:
                for(i = 0; i < n; ++i) {
                    System.out.println("Введите  элемент массива: ");
                    Scanner scn = new Scanner(System.in);
                    short el = scn.nextShort();
                    array[i] = el;
                }
        }

    }

    public void out(short[] array) {
        short[] var2 = array;
        int var3 = array.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int i = var2[var4];
            System.out.print(i + " ");
        }

        System.out.println();
    }

    public void reverse(int n, short[] array) {
        for(int i = n; i > 0; --i) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    public void insertion(short[] array) {
        for(int left = 0; left < array.length; ++left) {
            short value = array[left];

            int i;
            for(i = left - 1; i >= 0 && value < array[i]; --i) {
                array[i + 1] = array[i];
            }

            array[i + 1] = value;
        }

    }

    public void newarr(int n, int a, short[] arr, short[] array) {
        for(int i = 0; i < n + a; ++i) {
            if (i < n) {
                arr[i] = array[i];
            } else {
                arr[i] = (short)((int)(-255.0D + Math.random() * 255.0D));
            }
        }

    }
}
