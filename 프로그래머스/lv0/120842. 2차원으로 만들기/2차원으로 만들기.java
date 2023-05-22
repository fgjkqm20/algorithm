import java.util.Arrays;

class Solution {
    public int[][] solution(int[] num_list, int n) {
        // 행(세로) 길이 계산
        // num_list의 길이에 n을 나누면 행 길이가 나온다.
        int rowLength = num_list.length/n;
        int[][] answer = new int[rowLength][n];
        
        for(int i=0; i<rowLength; i++) {
            // num_list를 열(가로) 길이 만큼씩 자른다.
            // 이를 answer의 각 행에 대입한다.
            answer[i] = Arrays.copyOfRange(num_list, n*i, n*(i+1));
        }
        
        // n개씩 나뉜 2차원 배열 return
        return answer;
    }
}