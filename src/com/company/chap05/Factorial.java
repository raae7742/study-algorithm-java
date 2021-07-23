package com.company.chap05;
// 팩토리얼을 재귀적으로 구현

import java.util.Scanner;

public class Factorial {
    // 양의 정수 n의 팩토리얼 반환
    static int factorial(int n) {
        if (n > 0)
            return n * factorial(n-1);
        else
             return 1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("정수를 입력하세요. : ");
        int x = s.nextInt();

        System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
    }
}
