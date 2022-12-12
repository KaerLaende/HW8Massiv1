import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Массивы. Часть 1
        //Задание 1
        int[] integers = new int[]{1, 2, 3};
        double[] massivDouble = {1.57, 7.654, 9.986};
        int[] myMassiv = {1, 2, 3, 4, 5};

        //Задание 2
        System.out.println("Задание 2");
        for (int i = 0; i < integers.length; i++) {
            if (i == integers.length - 1) {
                System.out.print(integers[i]);
            } else {
                System.out.print(integers[i] + ",");
            }
        }
        System.out.println();

        for (int i = 0; i < massivDouble.length; i++) {
            if (i == massivDouble.length - 1) {
                System.out.print(massivDouble[i]);
            } else {
                System.out.print(massivDouble[i] + ",");
            }
        }
        System.out.println();
        for (int i = 0; i < myMassiv.length; i++) {
            if (i < myMassiv.length - 1) {
                System.out.print(myMassiv[i] + ",");
            } else {
                System.out.print(myMassiv[i]);
            }
        }
        System.out.println();

        System.out.println("Задание 3");
        for (int i = integers.length-1;i >=0; i--) {
            if (i > 0) {
                System.out.print(integers[i]+ ",");
            } else {
                System.out.print(integers[i]);
            }
        }
        System.out.println();

        for (int i = massivDouble.length-1;i >=0; i--) {
            if (i > 0) {
                System.out.print(massivDouble[i]+ ",");
            } else {
                System.out.print(massivDouble[i]);
            }
        }
        System.out.println();
        for (int i = myMassiv.length-1;i >=0; i--) {
            if (i > 0) {
                System.out.print(myMassiv[i]+ ",");
            } else {
                System.out.print(myMassiv[i]);
            }
        }
        System.out.println();

        System.out.println("Задание 4");
        for (int i = 0; i < integers.length; i++) {
            if (integers[i]%2==0 ) {
                System.out.println(integers[i]);
                continue;
            } else {
                integers[i] +=1;
            }
            System.out.println(integers[i]);
        }
        // и еще разок после того как прочитал подсказку:
        System.out.println(Arrays.toString(integers));
        }
    }
