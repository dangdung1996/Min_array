package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");
        int SIZE = sc.nextInt();
        int[] arr = new int[SIZE];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhaạp giá trị thứ " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        int Min = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if (arr[0] < Min) {
                arr[0] = Min;
            }
        }
        System.out.println("Phần tử nhỏ nhất là :" + Min);

    }
}
