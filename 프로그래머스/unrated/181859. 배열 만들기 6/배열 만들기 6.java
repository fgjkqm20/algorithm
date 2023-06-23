import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<arr.length; i++) {
            if(stack.empty()) {
                stack.push(arr[i]);
            } else if(stack.peek() == arr[i]) {
                stack.pop();
            } else {
                stack.push(arr[i]);
            }
        }
        
        if(stack.empty()) {
            return new int[] {-1};
        }
        
        int size = stack.size();
        int[] stk = new int[size];
        for(int i=size-1; i>=0; i--) {
            stk[i] = stack.pop();
        }
        
        return stk;
    }
}