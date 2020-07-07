package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Kakao4 {
    // 뉴스 클러스터링
    public int solution(String str1, String str2) {
        int answer = 0;
        float j = 0;
        List<String> arr1 = new ArrayList<>();
        List<String> arr2 = new ArrayList<>();
        for (int i = 0; i < str1.length() - 1; i++) {
            if (Pattern.matches("^[a-zA-Z]*$", str1.substring(i, i + 2))) {
                arr1.add(str1.substring(i, i + 2).toLowerCase());
            }
        }
        for (int i = 0; i < str2.length() - 1; i++) {
            if (Pattern.matches("^[a-zA-Z]*$", str2.substring(i, i + 2))) {
                arr2.add(str2.substring(i, i + 2).toLowerCase());
            }
        }
//        System.out.println("A: "+arr1);
//        System.out.println("B: "+arr2);
        int sum = sum(arr1, arr2);
        int intersect = intersect(arr1, arr2);
//        System.out.println(intersect+"와"+sum);
        if (sum != 0) {
            j = (float) intersect / sum;
        }
        if (sum == 0 && intersect == 0) {
            j = 1;
        }
//        System.out.println(j);

//        System.out.println((int) (j * 65536));
        answer = (int) (j * 65536);
        return answer;
    }

    public int sum(List<String> A, List<String> B) {
        List<String> list = new ArrayList<>();
        List<String> tmpA = new ArrayList<>();
        tmpA.addAll(A);
        list.addAll(B);
        for (int i = 0; i < B.size(); i++) {
            for(int j=0;j<tmpA.size();j++){
                if(B.get(i).equals(tmpA.get(j))){
                    tmpA.remove(j);
                    break;
                }
            }
        }
        list.addAll(tmpA);
//        System.out.println("sum: "+list);
        return list.size();
    }

    public int intersect(List<String> A, List<String> B) {
        List<String> list = new ArrayList<>();
        List<String> tmpA = new ArrayList<>();
        tmpA.addAll(A);
        for (int i = 0; i < B.size(); i++) {
            for(int j=0;j<tmpA.size();j++){
                if(B.get(i).equals(tmpA.get(j))){
                    list.add(tmpA.get(j));
                    tmpA.remove(j);
                    break;
                }
            }
        }
//        System.out.println("intersect: "+list);
        return list.size();
    }

}
