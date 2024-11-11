function solution(arr) {
    if(arr.length === 1 || arr.length === 0) {
        return [-1];
    }
    
    return answer = arr.filter(num => num !== Math.min(...arr));
}