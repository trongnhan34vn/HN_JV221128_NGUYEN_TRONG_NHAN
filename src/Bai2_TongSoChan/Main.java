package Bai2_TongSoChan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tổng các số chẵn trong khoảng 0 đến số nguyên dương n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên dương n: ");

        while (true) {
            int number = sc.nextInt();
            if (number > 0) {
                //        Tính tổng
                System.out.println("Kết quả: " + getSum(number));
                return;
            } else {
                System.out.println("Nhập vào số nguyên dương!");
            }
        }

    }

    public static int getSum(int number) {
        int sum = 0;
        for (int i = 2; i <= number; i += 2) {
            sum += i;
        }
        return sum;
    }

}
