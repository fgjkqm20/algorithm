function solution(myString) {
    const strArr = myString.split('x');
    let answer = [];
    
    for(let str of strArr) {
        answer.push(str.length)
    }
    
    return answer;
}