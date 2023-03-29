import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        // 배열 오름차순 정렬
        Arrays.sort(numbers);
        
        // 배열 길이 저장
        int length = numbers.length;
        
        // 가장 작은 수와 두 번째로 작은 수 저장
        // 곱한 수 모두가 음수이고 절대값이 크면
        // 양수의 곱보다 클 수도 있어 저장
        int num1 = numbers[0] * numbers[1];
        
        // 두 번째로 큰 수와 가장 큰 수의 곱 저장
        int num2 = numbers[length-1] * numbers[length-2];
        
        // 작은 수의 곱과 큰 수의 곱 중 큰 것을 answer에 저장
        int answer = (num1 >= num2) ? num1 : num2;
        return answer;
    }
}