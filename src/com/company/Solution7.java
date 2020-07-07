package com.company;

import java.util.Arrays;

public class Solution7 {
    // 숫자게임
    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int j=0;
        for (int i = 0; i < B.length; i++) {
            if (A[j] < B[i]) {
                answer++;
                j++;
            }
        }
//        System.out.println(answer);
        return answer;
    }
}
