function solution(left, right) {
    let answer = 0;
    let divisor = 0;
    
    for(let i = left; i <= right; i++) {
        for(let j = 1; j <= i; j++) {
            if(i % j === 0) {
                divisor++;
            }
        }
        
        if(divisor % 2) {
            answer -= i;
        } else {
            answer += i;
        }
        
        divisor = 0;
    }
    
    return answer;
}