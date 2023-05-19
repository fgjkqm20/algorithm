class Solution {
    public int solution(int num, int k) {
        // 정수 k를 문자로 변경
        char chNum = (char)('0'+k);
        // 정수 num를 문자열로 변경 후 문자 배열로 변경
        char[] chArr = String.valueOf(num).toCharArray();
        
        for(int i=0; i<chArr.length; i++) {
            // num을 이루는 숫자 중에 k가 있으면
            if(chArr[i] == chNum) {
                // 해당 자리 수 반환
                return i+1;
            }
        }
        
        // 찾지 못했을 경우
        return -1;
    }
}