package com.company.chap02;
// 두 배열이 같은가를 판단

import java.util.Scanner;

public class ArrayEqual {
    // 두 배열 a,b의 모든 요소가 같은가?
    static boolean equals(int[] a, int[] b) {
        if (a.length != b.length)
            return false;

        for (int i=0; i < a.length; i++)
            if (a[i] != b[i])
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("배열 a의 요소 개수 : ");
        int na = s.nextInt();

        int[] a = new int[na];

        for (int i=0; i<na; i++) {
            System.out.print("a["+i+"] : ");
            a[i] = s.nextInt();
        }

        System.out.print("배열 b의 요소 개수 : " );
        int nb = s.nextInt();

        int[] b = new int[nb];

        for (int i=0; i<nb; i++){
            System.out.print("b["+i+"] : ");
            b[i] = s.nextInt();
        }

        System.out.println("배열 a와 b는 "+(equals(a, b) ? "같습니다." : "같지 않습니다."));
    }
}
