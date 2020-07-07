package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution6 {
    //영어 끝말잇기
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int out = 2; //탈락자
        int cnt = 1; //탈락자의 몇번째 차례인지
        String s_word;
        String e_word;
        List<String> arr = new ArrayList();
        boolean is_fail = false;
        for (int i = 1; i < words.length; i++) {
            s_word = words[i - 1];
            e_word = words[i];
            if (i == 1) {
                arr.add(s_word);
            }
            // 차례 카운트 증가
            if (i % n == 0) {
                cnt++;
            }
            if(i!=1){
                if (n <= out) {
                    out = 1;
                } else {
                    out++;
                }
            }
            //앞에서 나왔던 단어인지 체크
            if (!arr.contains(e_word)) {
                arr.add(e_word);
                //앞단어 뒷글자와 뒷단어 앞글자가 같은지 확인
                if (!s_word.substring(s_word.length() - 1).equals(e_word.substring(0, 1))) {
                    is_fail = true;
                    break;
                }
            } else {
                is_fail = true;
                break;
            }
        }
        if(is_fail){
            answer[0] = out;
            answer[1] = cnt;
        }
        return answer;
    }
}
