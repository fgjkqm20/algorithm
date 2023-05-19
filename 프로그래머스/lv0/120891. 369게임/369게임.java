class Solution {
    public int solution(int order) {
        // 정수 order를 문자열로 변환 후 char 배열로 변환
        char[] chArr = String.valueOf(order).toCharArray();
        
        int clapCount = 0;  // 쳐야할 박수 횟수
        for(char ch : chArr) {
            // 박수를 쳐야할 때면
            switch(ch) {
                case '3': 
                case '6': 
                case '9':
                    // 쳐야할 박수 횟수 증가
                    clapCount++;
            }
        }
        
        return clapCount;
    }
}