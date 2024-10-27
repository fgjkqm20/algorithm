function solution(myString) {
    let answer = '';
    
    for(let i = 0; i< myString.length; i++) {
        if(myString.charAt(i) < 'l') {
            answer += 'l';
        } else {
            answer += myString.charAt(i)
        }
    }
    
    return answer;
}