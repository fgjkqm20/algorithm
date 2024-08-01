import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        String[] strArray = my_string.split(" ");
        ArrayList<String> answer = new ArrayList<>();
        
        for(String str : strArray) {
            if(!str.equals("")) {
                answer.add(str);
            }
        }
        
        return answer.toArray(new String[0]);
    }
}
