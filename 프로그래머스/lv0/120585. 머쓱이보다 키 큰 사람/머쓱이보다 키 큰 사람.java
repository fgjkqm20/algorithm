class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        
        for(int element : array) {
            if(element > height){
                answer++;
            }
        }
        
        return answer;
    }
}