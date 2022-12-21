import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        for(int num : numlist){
            if(num%n == 0){
                temp.add(num);
            }
        }
        
        int[] answer = new int[temp.size()];
        for(int i=0; i<temp.size(); i++){
            answer[i] = temp.get(i);
        }
        
        return answer;
    }
}