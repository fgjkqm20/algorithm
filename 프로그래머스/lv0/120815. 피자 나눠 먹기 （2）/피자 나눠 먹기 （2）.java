class Solution {
    public int solution(int n) {
        int count = 1;
        
        int pieces = count * 6; 
        while(pieces%n != 0) {
            pieces = ++count * 6;
        }
        
        return count;
    }
}