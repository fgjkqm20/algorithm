import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public long solution(String numberWords) {
        List<String> numberToWord = Arrays.asList(new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" });
        
        String temp = "";
        String numberString = "";
        for(int i=0; i<numberWords.length(); i++) {
           temp += numberWords.charAt(i);
           if(numberToWord.contains(temp)) {
              numberString += numberToWord.indexOf(temp);
              temp = "";
           }
        }
        
        return Long.parseLong(numberString);
    }
}