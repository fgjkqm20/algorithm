class Solution {
    public int solution(String myString, String pat) {
        String convertedString = "";
        
        for(int i = 0; i < myString.length(); i++) {
            convertedString += myString.charAt(i) == 'A' ? 'B' : 'A'; 
        }
        
        return convertedString.contains(pat) ? 1 : 0;
    }
}