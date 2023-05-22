import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        // my_string를 모두 소문자로 변경
        String lowerCase = my_string.toLowerCase();
        
        // lowerCase를 char 배열로 변경
        char[] chArr = lowerCase.toCharArray();
        
        // chArr를 알파벳 순서대로 정렬
        Arrays.sort(chArr);
        
        // chArr를 문자열로 변경 후 return
        return String.valueOf(chArr);
    }
}