package com.company.chap03;
// 선형 검색 (보초법)

import java.util.Scanner;

public class SeqSearchSen {
    // 요소 개수가 n인 배열 a에서 key와 같은 요소를 선형 검색
    static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;

        a[n] = key;

        while (true) {
            if (a[i] == key)
                break;
            i++;
        }
        return i == n? -1 : i;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("요소 개수 : ");
        int num = s.nextInt();
        int[] x = new int[num+1];           // 요소 개수 num + 1

        for (int i=0; i<num; i++) {
            System.out.print("x[" + i + "]:");
            x[i] = s.nextInt();
        }

        System.out.print("검색할 값 : " );      // 키 값 입력
        int key = s.nextInt();

        int idx = seqSearchSen(x, num, key);

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(key+"은(는) x["+idx+"]에 있습니다.");
    }
}
