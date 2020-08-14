
        /*Задача №1*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число 1, 2 или 3: ");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt();
        System.out.println(i);
        if (i == 1) {
            System.out.println("Вы ввели число 1");
        } else if (i == 2) {
            System.out.println("Вы ввели число 2");
        } else if (i == 3) {
            System.out.println("Вы ввели число 3");
        }
        switch (i) {
            case 1:
                System.out.println("Вы ввели число 1");
                break;
            case 2:
                System.out.println("Вы ввели число 2");
                break;
            case 3:
                System.out.println("Вы ввели число 3");
                break;
        }

        /*Задача №2*/
        for (int number = 5; number >= 1; number--) {
            System.out.println(number + " ");
        }

        /*Задача №3*/
        for (int factor = 1; factor <= 10; factor++) {
            System.out.println("3*" + factor + "=" + 3 * factor);
        }

        /*Задача №4*/
        int[] numeric = new int[101];
        for (int value = 1; value < numeric.length; value++) {
            numeric[value] = value;
        }
        int summ = 0;
        int count = 0;
        for (int digit = 1, q= 1; digit <= 100; digit++,q++) {
            summ = numeric[digit] + summ;
            count = q;
        }
        int average = summ / count;
        System.out.println(summ);
        System.out.println(average);

        /*Задача №5*/
        int[] array = {5, 2, 4, 8, 88, 22, 10};
        int max = array[0];
        for(int in = 1; in < array.length; in++) {
            if(array[in] > max){
                max = array[in];
            }
        }
        System.out.println(max);

    }
}




