package com.programmers.level1;

public class Remainder1 {
	public int solution(int n) {
        int answer = 0;
        for(int x=1; x<=n; x++){
            if(n%x==1){
                answer= x;
                break;
            }
        }
        return answer;
    }
}
