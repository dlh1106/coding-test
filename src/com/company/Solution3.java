package com.company;

public class Solution3 {
    //점프와 순간 이동
    public int solution(int n) {
        int ans = 0;
        while(n != 0){//남은 거리가 2로 나눠지면 순간이동 아니라면 점프 점프했을땐 배터리 소모
            if(n % 2==0){
                n /= 2;
            }else{
                n--;
                ans++;
            }
        }
        return ans;
    }
}
