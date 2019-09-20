import java.util.Scanner;
public class Main {
    public static void enter(int n, short array[]) {
        System.out.println("Введите способ ввода: 1 - рандом, 2 - ручной ");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        switch (x) {
            case 1:
                for (int i = 0; i < n; i++) {
                    array[i] = (short) (-255 + (Math.random() * 255));
                }
                break;
            case 2:
                for (int i = 0; i < n; i++) {

                    System.out.println("Введите  элемент массива: ");
                    Scanner scn = new Scanner(System.in);
                    short el = scn.nextShort();
                    array[i] = el;
                }
                break;
        }
    }
    public  static  void out(short array[])
    {
        for (int i:array) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public  static void reverse(int n,short array[])
    {
      for(int i = n; i>0; i--)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void insertion(short array[]) {
        for (int left = 0; left < array.length; left++) {
            // Вытаскиваем значение элемента
            short value = array[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array[i + 1] = value;
        }
    }
    public static void newarr(int n,int a,short arr[],short array[]) {

                for (int i = 0; i < n+a; i++) {
                    if(i<n)
                    {
                        arr[i] = array[i];
                    }
                    else {
                        arr[i] = (short) (-255 + (Math.random() * 255));
                    }
        }
    }
    public static void main(String[] args) {
        System.out.println("Введите количество элементов массива: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        short array[] = new short[n];
        enter(n, array);
        out(array);
        System.out.println("Хотите увеличить размер массива ?: Да: 1, Нет: 2 ");
        Scanner st = new Scanner(System.in);
        int str = st.nextInt();
        switch (str) {
            case 1:
                System.out.println("Насколько элемнтов увеличить предыдущий массив: ");
                Scanner some = new Scanner(System.in);
                int a = sc.nextInt();
                short arrayNew[] = new short[n + a];
                newarr(n, a, arrayNew, array);
                out(arrayNew);
                break;
            case 2:
                System.out.println("Ну, как хотите!");
                break;

        }
        System.out.println("Отсортированный массив: ");
        insertion(array);
        out(array);
    }
}


