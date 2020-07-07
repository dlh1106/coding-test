package com.company;

import java.util.ArrayList;
import java.util.List;

public class Kakao2 {
    // 캐시
    private List<String> cache = new ArrayList<>();

    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if(cacheSize == 0) return 5 * cities.length;
        for(int i=0;i<cities.length;i++){
            answer += search(cacheSize,cities[i]);
//            System.out.println("실행시간: "+answer);
        }
        return answer;
    }
    public int search(int cacheSize, String city){
        int runtime = 0;
        String low_city = city.toLowerCase();
        if(cache.size()==0){
            cache.add(low_city);
            return 5;
        }
        //캐시안에 검색어가 없는경우
        if(!cache.contains(low_city)){
            //캐시용량이 넘어갈때
            if(cache.size()>=cacheSize){
                cache.remove(0);
            }
            cache.add(low_city);
            runtime = 5;
        }else{
            //최근 사용된 정보는 뒤로 보내줌
            cache.remove(low_city);
            cache.add(low_city);
            runtime = 1;
        }
//        System.out.println("캐시 : "+cache);
        return runtime;
    }
}
