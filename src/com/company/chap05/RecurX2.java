package com.company.chap05;

import com.company.chap04.IntStack;

public class RecurX2 {
    // 꼬리 재귀 제거
    static void recur(int n) {
        IntStack s = new IntStack(n);

        while (true) {
            if (n>0) {
                s.push(n);
                n = n-1;
                continue;
            }
            if (s.isEmpty() != true) {
                n = s
            }
        }
    }
}
