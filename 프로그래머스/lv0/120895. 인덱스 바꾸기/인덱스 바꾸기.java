class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] chArr = my_string.toCharArray();
        
        char temp = chArr[num1];
        chArr[num1] = chArr[num2];
        chArr[num2] = temp;
        
        return String.valueOf(chArr);
    }
}