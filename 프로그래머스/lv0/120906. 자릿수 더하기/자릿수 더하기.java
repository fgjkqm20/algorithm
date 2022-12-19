class Solution {
    public int solution(int n) {
        int answer = 0;
        String strNum = Integer.toString(n);
        
        for(int i=0; i<strNum.length(); i++){
            answer += Integer.parseInt(strNum.substring(i, i+1));
        }
        
        return answer;
    }
}