class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        boolean aIsOdd = a % 2 == 1;
        boolean bIsOdd = b % 2 == 1;
        
        if(aIsOdd && bIsOdd) {
            answer += Math.pow(a, 2) + Math.pow(b, 2);
        } else if(aIsOdd || bIsOdd) {
            answer += 2 * (a + b);
        } else {
            answer += Math.abs(a - b);
        }
        
        return answer;
    }
}