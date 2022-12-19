class Solution {
    public int[] solution(int[] num_list) {
        int list_length = num_list.length;
        int[] answer = new int[list_length];
        
        for(int i=0; i<list_length; i++){
            answer[i] = num_list[list_length-i-1];
        }
        
        return answer;
    }
}