package com.company;

public class Solution5 {
    // 방문길이
    class Codemap {
        private int x = 0;
        private int y = 0;
        private int nextX = 5;
        private int nextY = 5;
        private int[] dx = new int[] {1,-1,0,0};
        private int[] dy = new int[] {0,0,1,-1};

        private int leng = 0;
        private boolean[][][][] visit = new boolean[11][11][11][11];

        public void move(String cir){
            //현재 위치저장
            x = nextX;
            y = nextY;
            //다음위치 이동
            int idx = 0;
            switch (cir){
                case "R":
                    idx = 0;
                    break;
                case "L":
                    idx = 1;
                    break;
                case "U":
                    idx = 2;
                    break;
                case "D":
                    idx = 3;
                    break;
            }
            this.nextX += dx[idx];
            this.nextY += dy[idx];

            //지도 범위를 벗어날 경우
            if(nextX>10 || nextY>10 || nextX<0 || nextY<0){
                this.nextX -= dx[idx];
                this.nextY -= dy[idx];
                return;
            }

            // 처음 방문하는 길인경우
            if(!visit[x][y][nextX][nextY] && !visit[nextX][nextY][x][y]){
                visit[x][y][nextX][nextY] = true;
                visit[nextX][nextY][x][y] = true;
                leng++;
            }
        }

        public int getLeng() {
            return leng;
        }
//
        @Override
        public String toString() {
            return this.x +":"+this.y;
        }
    }

    public int solution(String dirs) {
        int answer = 0;
        int count = dirs.length();
        Codemap codemap = new Codemap();
        for(int i=0;i<count;i++){
            String str = dirs.substring(i,i+1);
            codemap.move(str);
//            System.out.println(codemap.toString());
//            System.out.println(codemap.getLeng());
        }
        answer = codemap.getLeng();
        return answer;
    }
}
