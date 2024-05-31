class Solution {
    public String solution(String n_str) {
        String answer = "";
        
        if(n_str.charAt(0) == '0') {
            int i = 0;
            while(n_str.charAt(i) == '0') {
                i++;
            }
            
            while(i < n_str.length()) {
                answer += n_str.charAt(i++);
            }
            
            return answer;
        }
        
        return n_str;
    }
}