class Solution {
    public String solution(int age) {
        char[] chArr = Integer.toString(age).toCharArray();
        
        String answer = "";
        
        for(char ch : chArr){
            int temp = 'a' + (ch - '0');
            answer += (char)temp;
        }
        
        return answer;
    }
}