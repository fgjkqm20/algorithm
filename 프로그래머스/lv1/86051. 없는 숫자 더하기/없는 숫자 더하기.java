class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        for(int i=1; i<=9; i++){
            int j = 0;
            
            for(int number : numbers){
                if(i == number){
                    break;
                }
                j++;
            }
            
            if(j == numbers.length){
                answer += i;
            }
        }
        
        return answer;
    }
}