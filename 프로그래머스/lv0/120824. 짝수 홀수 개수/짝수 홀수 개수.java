class Solution {
    public int[] solution(int[] num_list) {
        int even = 0;
        int odd = 0;
        
        // 0도 짝수다.
        for(int num : num_list){
            if(num%2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        
        int[] answer = { even, odd };
        return answer;
    }
}