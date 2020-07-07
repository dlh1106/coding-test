package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    // 스킬트리
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        List<String> que = new ArrayList();
        for(int i=0;i<skill.length();i++){
            que.add(skill.substring(i,i+1));
        }
        for(int i=0;i<skill_trees.length;i++){
            String str = skill_trees[i];
            List<String> quetmp = new ArrayList();
            boolean chk = false;
            for(int j=0;j<str.length();j++){
                if(que.contains(str.substring(j,j+1))){
                    quetmp.add(str.substring(j,j+1));
                }
            }
            for(int j=0;j<que.size() && j<quetmp.size();j++){
                if(!que.get(j).equals(quetmp.get(j))){
                    chk = false;
                    break;
                }else{
                    chk = true;
                }
            }
            if(chk || quetmp.size()==0){
                answer++;
            }
//            System.out.println(que);
//            System.out.println(quetmp);
//            System.out.println(chk);
        }
        return answer;
    }
}
