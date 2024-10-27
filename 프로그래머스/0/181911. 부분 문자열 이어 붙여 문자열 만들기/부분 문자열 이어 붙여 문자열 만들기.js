function solution(my_strings, parts) {
    let answer = '';
    
    let str_parts = my_strings.map((str, index) => {
        return str.substring(parts[index][0], parts[index][1] + 1)
    })
    
    str_parts.forEach(str => answer += str);
    
    return answer;
}