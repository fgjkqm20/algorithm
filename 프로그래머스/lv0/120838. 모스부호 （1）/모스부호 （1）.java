class Solution {
    public String solution(String letter) {
        // 문자열 letter의 '.'은 '0'으로, '-'은 '1'로 치환
        letter = letter.replace('.', '0').replace('-', '1');
        // 문자열 letter을 " "을 기준으로 분할
        String[] morseArr = letter.split(" ");
        
        /*
         * 모스부호 '.'을 '0', '-'을 '1'로 볼 때
         * 행 = 자릿수-1
         * 열 = 숫자 크기
         * 예: morseToChar[1][2] = 'n' = '-.' = '10' = 2
        */
        char[][] morseToChar = { 
            { 'e', 't'},
            { 'i', 'a', 'n', 'm' },
            { 's', 'u', 'r', 'w', 
              'd', 'k', 'g', 'o' },
            { 'h', 'v', 'f', 'Ŭ',
              'l', 'Æ', 'p', 'j',
              'b', 'x', 'c', 'y',
              'z', 'q'}
        };
        
        String plaintext = ""; // 평문
        // 모스부호 개수만큼 반복
        for(int i=0; i<morseArr.length; i++) {
            // 행 = 문자열 morseArr[i]의 길이-1
            int row = morseArr[i].length()-1;
            // 열 = 문자열 morseArr[i]을 2진수로 보았을 때 크기
            int column = Integer.parseInt(morseArr[i], 2);
            // 모스 부호에 해당하는 문자 = morseToChar[row][column]
            plaintext += morseToChar[row][column];
        }
        
        // 모스보호를 평문으로 변환한 결과를 return
        return plaintext;
    }
}