package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Kakao6 {
    //오픈 채팅방
    public String[] solution(String[] record) {
        List<String> list = new ArrayList();
        Map<String, Object> user = new HashMap<>();

        for (String s : record) {
            String[] tmp = s.split(" ");
            if (tmp[0].equals("Enter")) {
                user.put(tmp[1], tmp[2]);
                list.add(tmp[1] + "님이 들어왔습니다.");
            } else if (tmp[0].equals("Leave")) {
                list.add(tmp[1] + "님이 나갔습니다.");
            } else {
                user.put(tmp[1], tmp[2]);
            }
        }
        String[] answer = new String[list.size()];
        for(int i=0;i<list.size();i++){
            int idx = list.get(i).indexOf("님이");
            String id = list.get(i).substring(0,idx);
            answer[i] = list.get(i).replace(id, (String) user.get(id));
        }
//        System.out.println(Arrays.toString(answer));
        return answer;
    }

}
