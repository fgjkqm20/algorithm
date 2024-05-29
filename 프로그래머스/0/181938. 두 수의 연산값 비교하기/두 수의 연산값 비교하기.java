class Solution {
    public int solution(int a, int b) {
        String numStr = Integer.toString(a) + Integer.toString(b);
        int num1 = Integer.parseInt(numStr);
        int num2 = 2 * a * b;
        
        return num1 >= num2 ? num1 : num2;
    }
}