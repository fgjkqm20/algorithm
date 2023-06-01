class Solution {
    public int solution(int[] num_list) {
        int allSum = 0;
        int allMultiply = 1;
        
        for(int num : num_list) {
            allSum += num;
            allMultiply *= num;
        }
        
        return allMultiply < allSum*allSum ? 1 : 0;
    }
}