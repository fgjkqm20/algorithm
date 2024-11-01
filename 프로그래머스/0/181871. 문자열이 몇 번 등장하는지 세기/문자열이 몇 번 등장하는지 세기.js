function solution(myString, pat) {
    let answer = 0;
    
    for(let i = 0; i < myString.length - pat.length + 1; i++) {
        const partStr = myString.substring(i, i + pat.length);
        
        if(partStr === pat) {
            answer++;
        }
    }
    
    return answer;
}