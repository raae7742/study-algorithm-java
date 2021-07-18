package com.company.chap02;
// 1,000 이하의 소수를 열거(버전 2)

public class PrimeNumber2 {
    public static void main(String[] args) {
        int counter = 0;                        // 나눗셈 횟수
        int ptr = 0;                            // 찾은 소수의 개수
        int[] prime = new int[500];             // 소수를 저장하는 배열

        prime[ptr++] = 2;                       // 2는 소수

        for (int n=3; n<=1000; n+=2) {          // 대상은 홀수만
            int i;
            for (i=1; i<ptr; i++) {             // 이미 찾은 소수로 나누기
                counter++;
                if (n%prime[i] == 0)            // 나눠떨어지면 -> 소수 x
                    break;                      // 더 이상의 반복 불필요
            }
            if (ptr==i)                         // 마지막까지 나누어 떨어지지 않으면
                prime[ptr++] = n;               // 배열에 저장 -> 소수 o
        }

        for (int i=0; i<ptr; i++)               // 찾은 ptr 개의 소수 출력
            System.out.println(prime[i]);

        System.out.println("나눗셈을 수행한 횟수 : " +counter);
    }
}
