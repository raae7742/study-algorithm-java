package com.company.chap04;
// 원하는 개수만큼 값을 입력 받아 요소 개수가 N인 배열에 마지막 N개를 저장

import java.util.Scanner;

public class LastNElements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final int N = 10;
        int[] a = new int[N];
        int cnt = 0;
        int retry;

        System.out.println("정수를 입력하세요.");

        do {
            System.out.printf("%d번째 정수 : ", cnt + 1);
            a[cnt++ % N] = s.nextInt();

            System.out.print("계속 할까요? (예.1/아니오.0) : ");
            retry = s.nextInt();
        } while (retry == 1);

        int i = cnt - N;
        if ( i < 0) i = 0;

        for (; i < cnt; i++)
            System.out.printf("%2d번째의 정수=%d\n", i+1, a[i%N]);
    }
}
