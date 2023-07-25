class Solution {
    public int[] solution(int n, int k) {
        // n 이하의 정수 중 k의 배수 개수 = n/k
        int arrayLength = n/k;
        int[] answer = new int[arrayLength];
        
        for(int i=0; i<arrayLength; i++) {
            // 각 인덱스에 k 배수 저장
            answer[i] = k*(i+1);
        }
        
        return answer;
    }
}