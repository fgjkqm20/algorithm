class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        
        for(int i=0; i<arr.length; i++) {
            boolean isOverFifty = arr[i] >= 50;
            boolean isEven = arr[i]%2 == 0;
            
            if(isOverFifty && isEven) {
                answer[i] = arr[i] / 2;
            } else if(isOverFifty == isEven) {
                answer[i] = arr[i] * 2;
            } else {
                answer[i] = arr[i];
            }
        }
        
        return answer;
    }
}