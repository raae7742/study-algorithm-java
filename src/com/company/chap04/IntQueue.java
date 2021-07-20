package com.company.chap04;
// int형 큐

public class IntQueue {
    private int max;        // 큐의 용량
    private int front;      // 첫 번째 요소 커서
    private int rear;       // 마지막 요소 커서
    private int num;        // 현재 데이터 수
    private int[] que;      // 큐 본체

    // 실행 시 예외 : 큐가 비어 있음
    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() { }
    }

    // 실행 시 예외 : 큐가 가득 참
    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() { }
    }

    // 생성자
    public IntQueue(int capacity) {
        num = front = rear = 0;
        max = capacity;
        try {
            que = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    // 큐에 데이터 인큐
    public int enque(int x) throws OverflowIntQueueException {
        if (num >= max)
            throw new OverflowIntQueueException();  // 큐가 가득참
        que[rear++] = x;
        num++;
        if (rear == max)
            rear = 0;
        return x;
    }

    // 큐에서 데이터 디큐
    public int deque() throws EmptyIntQueueException {
        if (num <= 0)
            throw new EmptyIntQueueException();
        int x = que[front++];
        num--;
        if (front == max)
            front = 0;
        return x;
    }

    // 큐에서 데이터 피크
    public int peek() throws EmptyIntQueueException {
        if (num <= 0)
            throw new EmptyIntQueueException();
        return que[front];
    }

    // 큐에서 x의 인덱스 반환(없으면 -1)
    public int indexOf(int x) {
        for (int i=0; i<num; i++) {
            int idx = (i + front) % max;
            if (que[idx] == x)
                return idx;                 // 검색 성공
        }
        return -1;                          // 검색 실패
    }

    // 큐 비우기
    public void clear() {
        num = front = rear = 0;
    }

    // 큐의 용량 반환
    public int capacity() {
        return max;
    }

    // 큐에 쌓인 데이터 수 반환
    public int size() {
        return num;
    }

    // 큐가 비어있는지 여부
    public boolean isEmpty() {
        return num <= 0;
    }

    // 큐가 가득찼는지 여부
    public boolean isFull() {
        return num >= max;
    }

    // 큐 안의 모든 데이터 출력(front -> rear)
    public void dump() {
        if (num <= 0)
            System.out.println("큐가 비어 있습니다.");
        else {
            for (int i=0; i<num; i++)
                System.out.print(que[(i + front) % max] + " ");
            System.out.println();
        }
    }
}
