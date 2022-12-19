class Solution {
    public int[] solution(int money) {
        int cup = money / 5500;
        int change = money % 5500;
        
        int[] answer = { cup, change };
        return answer;
    }
}