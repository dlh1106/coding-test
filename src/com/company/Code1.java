package com.company;

import java.util.Arrays;

public class Code1 {
    public int solution(int N) {
        // write your code in Java SE 8
        int count = 0;
        boolean chk = false;
        String str = Integer.toBinaryString(N);
//        System.out.println(str);
        String[] arr = str.split("1");
//        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            if(str.substring(str.length()-1).equals("0")){
                if(i==arr.length-1) break;
            }
            if(count<arr[i].length()){
                count = arr[i].length();
            }
//            System.out.println(count);
        }
//        System.out.println("답"+count);
        return count;
    }
}
