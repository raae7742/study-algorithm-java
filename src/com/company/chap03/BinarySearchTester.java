package com.company.chap03;
// Arrays.binarySearch로 이진 검색

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("요소 개수 : ");
        int num = s.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0] : ");            // 배열의 첫 요소를 먼저 입력
        x[0] = s.nextInt();

        for (int i=1; i<num; i++) {
            do {
                System.out.print("x["+i+"] : ");
                x[i] = s.nextInt();
            } while (x[i] < x[i-1]);            // 바로 앞의 요소보다 작으면 다시 입력
        }

        System.out.print("검색할 값 : ");
        int ky = s.nextInt();

        int idx = Arrays.binarySearch(x, ky);

        if (idx < 0)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(ky+"은(는) x["+idx+"]에 있습니다.");
    }
}
