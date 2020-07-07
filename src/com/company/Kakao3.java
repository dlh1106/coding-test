package com.company;

import java.util.ArrayList;
import java.util.List;

public class Kakao3 {
    private List<List<String>> arr = new ArrayList();
    private int block_cnt = 0;

    public int solution(int m, int n, String[] borad) {
        for (int i = 0; i < n; i++) {
            List<String> temp = new ArrayList();
            for (int j = m - 1; j >= 0; j--) {
                temp.add(String.valueOf(borad[j].charAt(i)));
            }
            arr.add(temp);
        }

        List<List<Integer>> chk = null;
        do {
            chk = new ArrayList();
            for (int i = 0; i < n - 1; i++) {
                List<Integer> temp = new ArrayList();
                for (int j = 0; j < m - 1; j++) {
                    // 1행 2문자와 2행 2문자 비교
                    if (!arr.get(i).get(j).equals("-")
                            && arr.get(i).get(j).equals(arr.get(i).get(j + 1))
                            && arr.get(i).get(j).equals(arr.get(i + 1).get(j))
                            && arr.get(i + 1).get(j).equals(arr.get(i + 1).get(j + 1))) {
//                        System.out.println(arr.get(i).get(j)+" 과 "+arr.get(i).get(j+1)+" 과 "+
//                                arr.get(i+1).get(j)+" 과 "+arr.get(i+1).get(j+1));
                        temp.add(i);
                        temp.add(j);
                    }
                }
                if (!temp.isEmpty()) chk.add(temp);
            }
            if (chk.size() > 0) setArr(chk);
//            System.out.println(arr);
            System.out.println(chk);
        } while (chk.size() > 0);
        return block_cnt;
    }

    public void setArr(List<List<Integer>> chk) {
        System.out.println("변경 전: "+arr);

        for (int i = 0; i < chk.size(); i++) {
            if (!arr.get(chk.get(i).get(0)).get(chk.get(i).get(1)).equals("-")) block_cnt++;
            arr.get(chk.get(i).get(0)).set(chk.get(i).get(1), "-");

            if (!arr.get(chk.get(i).get(0)).get(chk.get(i).get(1) + 1).equals("-")) block_cnt++;
            arr.get(chk.get(i).get(0)).set(chk.get(i).get(1) + 1, "-");

            if (!arr.get(chk.get(i).get(0) + 1).get(chk.get(i).get(1)).equals("-")) block_cnt++;
            arr.get(chk.get(i).get(0) + 1).set(chk.get(i).get(1), "-");

            if (!arr.get(chk.get(i).get(0) + 1).get(chk.get(i).get(1) + 1).equals("-")) block_cnt++;
            arr.get(chk.get(i).get(0) + 1).set(chk.get(i).get(1) + 1, "-");

        }
        System.out.println("변경 후: "+arr);
        for (int i = 0; i < arr.size(); i++) {
            int n = 0;
            for (int j = 0; j < arr.get(i).size(); j++) {
//                System.out.println(arr);
                if (arr.get(i).get(n).equals("-")) {
                    arr.get(i).remove(n);
                    arr.get(i).add("-");
                } else {
                    n++;
                }
            }
        }
        System.out.println("삭제 후: "+arr);
//        System.out.println(block_cnt);
    }


}
