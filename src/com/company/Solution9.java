package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution9 {
    // 기지국 설치
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        // 이미 전파가 닿는 아파트 구하기
        for (int station : stations) {
            int scope = w;
            for (int j = 0; j < w * 2 + 1; j++) {
//                System.out.println("값:"+(stations[i]-scope));
                list.add(station - scope);
                scope--;
            }

        }
//        System.out.println(list);
        for(int i=1;i<=n;i++){
            //기지국 전파가 안닿을때
            if(!list.contains(i)){
                //기지국 오른쪽 범위에 다음 기지국 없을때
                if(!list.contains(i+w)){
                    i = i+(2*w);
                    answer++;
                }else{
                    i = i+w;
                    answer++;
                }
//                System.out.println("값:"+i);
            }
        }
//        System.out.println("답:"+answer);
        return answer;
    }
}
