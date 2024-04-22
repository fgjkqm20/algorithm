import java.util.Arrays;
import java.util.OptionalInt;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if(arr1.length != arr2.length) {
            return arr1.length > arr2.length ? 1 : -1;
        }
        
        int sumArr1 = 
            Arrays.stream(arr1)
                  .reduce((total, num) -> total + num)
                  .getAsInt();
        int sumArr2 = 
            Arrays.stream(arr2)
                  .reduce((total, num) -> total + num)
                  .getAsInt();
        
        if(sumArr1 != sumArr2) {
            return sumArr1 > sumArr2 ? 1 : -1;
        } else {
            return 0;
        }
    }
}