class Solution {
    public int solution(int[] num_list) {
        if(num_list.length >= 11) {
            int all_add = 0;
            
            for(int num : num_list) {
                all_add += num;
            }
            
            return all_add;
        } else {
            int all_mul = 1;
            
            for(int num : num_list) {
                all_mul *= num;
            }
            
            return all_mul;
        }
    }
}