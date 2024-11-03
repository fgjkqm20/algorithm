function solution(x, n) {
    let answer = [];
    
    
    let value = 0;
    for(let i = 0; i < n; i++) {
        value += x;
        answer.push(value);
    }
    
    return answer;
}