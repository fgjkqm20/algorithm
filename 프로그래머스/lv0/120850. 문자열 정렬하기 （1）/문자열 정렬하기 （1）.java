import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> solution(String my_string) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for(int i=0; i<my_string.length(); i++){
            char ch = my_string.charAt(i);
            
            if(ch >= '0' && ch <= '9'){
                answer.add(ch - '0');
            }
        }
        Collections.sort(answer);

        return answer;
    }
}