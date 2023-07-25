import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> solution(int start, int end) {
        List<Integer> answer = new ArrayList<Integer>();
        
        for(int i=start; i<=end; i++) {
            answer.add(i);
        }
        
        return answer;
    }
}