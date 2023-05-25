import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        // LinkedHashSet: 중복을 허용하지 안되 삽입된 순서대로 저장된다.
        Set<Character> chSet = new LinkedHashSet<>();
        
        // chSet에 my_string을 문자 단위로 삽입한다.
        for(int i=0; i<my_string.length(); i++) {
            chSet.add(my_string.charAt(i));
        }
        // chSet을 Object 배열로 변환한다. 
        Object[] objArr = chSet.toArray();
        
        String answer = "";
        // objArr에 저장된 값들을 문자열로 변환해 answer에 저장한다.
        for(Object obj : objArr) {
            answer += String.valueOf(obj);
        }
        
        // 중복된 문자를 제거한 문자열 return
        return answer;
    }
}