function solution(myStr) {
    let answer = [];
    
    let str = '';
    for(let i = 0; i < myStr.length; i++) {
        const ch = myStr.charAt(i);
        
        if(ch === 'a' || ch === 'b' || ch === 'c') {
            if(str !== '') {
                answer.push(str);
            }
            
            str = '';
            continue;
        }
        
        str += ch;
    }
    
    if(str !== '') {
        answer.push(str);
    }
    
    return answer.length ? answer : ["EMPTY"];
}