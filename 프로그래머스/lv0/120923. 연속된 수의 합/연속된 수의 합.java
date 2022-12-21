class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int max = total+num;
        while(true){
            int value = 0;
            for(int i=0; i<num; i++){
                value += max-i;
            }
            if(value == total){
                for(int i=num-1; i>=0; i--){
                    answer[i] = max--;
                }
                break;
            }
            max--;
        }
        
        return answer;
    }
}