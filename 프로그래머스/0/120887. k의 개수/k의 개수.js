function solution(i, j, k) {
    let answer = 0;
    
    for(let n = i; n <= j; n++) {
        Array.from(String(n)).forEach(ch => ch === String(k) ? answer += 1 : answer += 0)
    }
    
    return answer;
}