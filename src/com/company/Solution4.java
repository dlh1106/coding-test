package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution4 {
    //종이접기
    public int[] solution(int n) {
        int[] answer = {};
        //배열에서 첫번째 0 두번째 넣을땐 1 사이에 배열의 원소넣음
        List<Integer> arr = new ArrayList();
        int i = 1;
        arr.add(0);
        while(i<n){
            List<Integer> arrtmp = new ArrayList();
            for(int j=0;j<arr.size();j++){
                if(j%2==0){
                    arrtmp.add(0);
                    arrtmp.add(arr.get(j));
                    arrtmp.add(1);
                }else{
                    arrtmp.add(arr.get(j));
                }
            }
            arr.removeAll(arr);
            arr.addAll(arrtmp);
            i++;
        }
        answer = new int[arr.size()];
        for(int j=0;j<arr.size();j++){
            answer[j] = arr.get(j);
        }
        return answer;

    }
}
