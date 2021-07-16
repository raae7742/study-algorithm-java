package com.company.chap01;

import java.util.Scanner;

public class SumForPos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");

        do {
            System.out.println("n의 값 : ");
            n = s.nextInt();
        } while (n <= 0);

        int sum = 0;        // 합

        for (int i=1; i<=n; i++)
            sum += i;       // sum에 i를 더합니다.

        System.out.println("1부터 " +n+ "까지의 합은 " +sum+ "입니다.");
    }
}