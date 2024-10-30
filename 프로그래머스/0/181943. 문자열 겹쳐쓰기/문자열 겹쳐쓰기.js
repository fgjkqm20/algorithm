function solution(my_string, overwrite_string, s) {
    const answer = my_string.substring(0, s).concat(overwrite_string);
    
    if(answer.length === my_string.length) {
        return answer;
    }
    
    return answer.concat(my_string.substring(answer.length))
}