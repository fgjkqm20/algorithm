class Solution {
    public int solution(String str1, String str2) {
        int answer = 2;
        
        int length1 = str1.length();
        int length2 = str2.length();
        
        for(int i=0; i<length1-length2+1; i++){
            if(str1.substring(i, i+length2).equals(str2)){
                answer = 1;
            }
        }
        
        return answer;
    }
}