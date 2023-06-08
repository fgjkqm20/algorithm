class Solution {
    public int solution(String num_str) {
        int sum = 0;
        int length = num_str.length();
        
        for(int i=0; i<length; i++) {
            sum += num_str.charAt(i) - '0';
        }
        
        return sum;
    }
}