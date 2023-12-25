package org.example;

import java.util.Scanner;

public class Main {

    public static  int taskOne(int b, int c){
        return 4*(b+c-1)/2;
    }

    public static int taskTwo(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return  sum;
    }

    public static int taskFour(double a){
        double c = Math.round(a);
        return (int)c;
    }

    public static void taskFive(int q, int w){
        double c = Math.floor((double) q / w);
        int b = q % w;
        System.out.println("Задача №5 ");
        System.out.println("целая часть : " + (int)c);
        System.out.println("остаток : " + b);
    }

    public static void taskSix (int a, int b) {
        int temp = b;
        b = a;
        a = temp;
        System.out.println("Переменная а = " + a + " , Переменная b = " + b );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world");

        System.out.println("Введите своё имя:");
        String userName = sc.nextLine();

        System.out.println("Привет " + userName);


        // Задача 1
        System.out.println("Сумма цифр числа: " + taskOne(1,2));

        // Задача 2 и 3
        System.out.println("Задача №2 N3: " + taskTwo(12));

        // Задача 4
        System.out.println("Задача №4: " + taskFour(2.5));

        // Задача 5
        taskFive(26,8);

        // Задача 6
        taskSix(3 , 5);
    }

}