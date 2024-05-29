class Solution {
    public int solution(int a, int b) {
        String numStr1 = Integer.toString(a) + Integer.toString(b);
        String numStr2 = Integer.toString(b) + Integer.toString(a);
        
        int num1 = Integer.parseInt(numStr1);
        int num2 = Integer.parseInt(numStr2);
        
        return num1 >= num2 ? num1 : num2;
    }
}