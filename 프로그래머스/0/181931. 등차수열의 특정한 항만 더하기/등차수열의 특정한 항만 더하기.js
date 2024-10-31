function solution(a, d, included) {
    let answer = 0;
    
    let sum = a;
    for(let x of included) {
        if(x) {
            answer += sum;
        }
        
        sum += d;
    }
    
    return answer;
}