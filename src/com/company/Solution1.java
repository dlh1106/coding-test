package com.company;

public class Solution1 {
    // 멀쩡한 사각형 개수 구하기
    public long solution(int num1, int num2) {
        long answer = 1;
        long min = 0;
        min = gcd(num1,num2);
        answer = ((long)num1*(long)num2)-(((long)num1+(long)num2-min));
        return answer;
    }

    public int gcd(int a, int b){
        if(b ==0){
            return a;
        }
        return gcd(b, a%b);
    }
}
