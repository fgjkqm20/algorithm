function solution(names) {
    let answer = [];
    
    names.forEach((name, index) => {
        if(index % 5 === 0) {
            answer.push(name);
        }
    })
    
    return answer;
}