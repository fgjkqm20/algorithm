import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length + 1;
        int[] answer = Arrays.copyOf(num_list, length);
        
        int last = answer[length-2];
        int beforeLast = answer[length-3];
        if(last > beforeLast) {
            answer[length-1] = last - beforeLast;
        } else {
            answer[length-1] = last * 2;
        }
        
        return answer;
    }
}