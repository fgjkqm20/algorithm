class Solution {
    public int[] solution(int start, int end_num) {
        int answerLength = start - end_num + 1;
        int[] answer = new int[answerLength];
        
        for(int i=0; i<answerLength; i++) {
            answer[i] = start - i;
        }
        
        return answer;
    }
}