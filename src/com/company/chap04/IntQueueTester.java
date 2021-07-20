package com.company.chap04;
// int형 큐의 사용 예

import java.util.Scanner;

public class IntQueueTester {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        IntQueue que = new IntQueue(64);

        while (true) {
            System.out.println("현재 데이터 수 : " + que.size() + " / " + que.capacity());
            System.out.print("(1) 인큐 (2) 디큐 (3) 피크 (4) 덤프 (0) 종료 : ");

            int menu = s.nextInt();
            if (menu == 0) break;

            int x;
            switch (menu) {
                case 1:
                    System.out.print("데이터: ");
                    x = s.nextInt();
                    try {
                        que.enque(x);
                    } catch(IntQueue.OverflowIntQueueException e) {
                        System.out.println("큐가 가득 찼습니다.");
                    }
                    break;

                case 2:
                    try {
                        x = que.deque();
                        System.out.println("디큐한 데이터는 " + x + "입니다.");
                    } catch(IntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;

                case 3:
                    try {
                        x = que.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch(IntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;

                case 4:
                    que.dump();
                    break;
            }
        }
    }
}
