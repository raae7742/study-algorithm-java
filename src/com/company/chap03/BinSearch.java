package com.company.chap03;
import java.util.Scanner;
// 이진 검색

public class BinSearch {
    // 요소 개수가 n인 배열 ㅁ에서 key와 같은 요소를 이진 검색
    static int binSearch(int[] a, int n, int key) {
        int pl = 0;                 // 검색 범위의 첫 인덱스
        int pr = n-1;               // 검색 범위의 끝 인덱스

        do {
            int pc = (pl + pr) / 2; // 중앙 요소의 인덱스
            if (a[pc] == key)
                return pc;
            else if (a[pc] < key)
                pl = pc + 1;
            else
                pr = pc - 1;
        } while (pl <= pr);

        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("요소 개수 : ");
        int num = s.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0]: ");
        x[0] = s.nextInt();

        for (int i=1; i<num; i++) {
            do {
                System.out.print("x["+i+"] : ");
                x[i] = s.nextInt();
            } while (x[i] < x[i-1]);
        }

        System.out.print("검색할 값 : ");
        int ky = s.nextInt();

        int idx = binSearch(x, num, ky);

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(ky+"은(는) x[" + idx + "]에 있습니다.");
    }
}
