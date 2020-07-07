package com.company;

public class Solution8 {
    // 소수 만들기
    public int solution(int[] nums) {
        int answer = 0;
        int count = nums.length;
        // 3가지 수를 뽑는 경우의 수 배열 구하기
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                for (int k = j + 1; k < count; k++) {
                    int sum = nums[i]+nums[j]+nums[k];
//                    System.out.println(nums[i]+","+nums[j]+","+nums[k]+" 합: "+sum);
                    if(is_sosu(sum)){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    //소수 인지 판별하기
    public boolean is_sosu(int num) {
        boolean chk = true;
        if(num>2){
            for(int i=2;i<num;i++){
                if(num%i==0){//num 과 i 가 나누어 떨어지면 소수가 아니다
                    chk = false;
                    break;
                }
            }
        }else if(num==2){
            chk = true;
        }else{
            chk = false;
        }
        return chk;
    }

}
