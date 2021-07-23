package com.company.chap05;
// 재귀 함수 이해하기

import java.util.Scanner;

public class Recur {
    // 재귀 함수
    static void recur(int n) {
        if (n > 0) {
            recur(n-1);
            System.out.println(n);
            recur(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("정수를 입력하세요.:");
        int x = s.nextInt();

        recur(x);
    }
}
