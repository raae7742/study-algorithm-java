package com.company.chap01;
// 3개의 정수값을 입력하고 최댓값을 구합니다.

import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("세 정수의 최댓값을 구합니다.");
        System.out.println("a의 값 : "); int a = s.nextInt();
        System.out.println("b의 값 : "); int b = s.nextInt();
        System.out.println("c의 값 : "); int c = s.nextInt();

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("최댓값은 " + max + "입니다.");
    }
}
