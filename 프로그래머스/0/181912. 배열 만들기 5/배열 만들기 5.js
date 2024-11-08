function solution(intStrs, k, s, l) {
    let answer = [];
    
    for(let intStr of intStrs) {
        const num = +intStr.substring(s, s+l)
        
        if(num > k) {
            answer.push(num);
        }
    }
    
    return answer;
}