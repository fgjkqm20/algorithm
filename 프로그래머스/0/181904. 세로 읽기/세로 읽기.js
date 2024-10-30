function solution(my_string, m, c) {
    let answer = '';
    
    for(let i = c-1; i <= my_string.length-1; i += m) {
        answer += my_string.charAt(i);
    }
    
    return answer;
}