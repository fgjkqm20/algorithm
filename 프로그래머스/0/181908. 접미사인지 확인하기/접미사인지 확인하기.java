class Solution {
    public int solution(String my_string, String is_suffix) {
        boolean answer = my_string.endsWith(is_suffix);
        return answer ? 1 : 0;
    }
}