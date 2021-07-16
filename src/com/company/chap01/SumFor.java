package com.company.chap01;
// 1, 2, ..., n의 합을 구합니다.

import java.util.Scanner;

public class SumFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.println("n의 값: ");
        int n = s.nextInt();

        int sum = 0;        // 합
        for (int i=1; i<=n; i++)
            sum+=i;         // sum에 i를 더합니다.

        System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
    }
}
