class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(7*answer - n < 0){
            answer++;
        }
        
        return answer;
    }
}