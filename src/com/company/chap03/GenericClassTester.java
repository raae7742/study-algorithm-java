package com.company.chap03;
// 제네릭 클래스의 예

public class GenericClassTester {
    // 제네릭 클래스의 파라미터 T
    static class GenericClass<T> {
        private T xyz;

        public GenericClass(T xyz) {    // 생성자
            this.xyz = xyz;
        }

        public T getXyz() {             // xyz 반환
            return xyz;
        }
    }

    public static void main(String[] args) {
        // 파라미터에 String도, Integer도 넘길 수 있음
        GenericClass<String> s = new GenericClass<String>("ABC");
        GenericClass<Integer> n = new GenericClass<Integer>(15);

        System.out.println(s.getXyz());
        System.out.println(n.getXyz());
    }
}
