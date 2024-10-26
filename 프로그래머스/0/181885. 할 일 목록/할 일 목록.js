function solution(todo_list, finished) {
    let answer = [];
    
    finished.forEach((finished, index) => {
        if(!finished) {
            answer.push(todo_list[index]);
        }
    })
    
    return answer;
}