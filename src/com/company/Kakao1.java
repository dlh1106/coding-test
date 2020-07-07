package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Kakao1 {
    //추석 트래픽
    public int solution(String[] lines){
        int answer = 0;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        for(int i=0;i<lines.length;i++){

            List<String> list = new ArrayList<>(Arrays.asList(lines[i].split(" ")));
            try {
                Date d = format.parse(list.get(0)+" "+list.get(1));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return answer;
    }
}
