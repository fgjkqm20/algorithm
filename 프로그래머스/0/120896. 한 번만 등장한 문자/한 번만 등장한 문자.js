function solution(s) {
    let result = [];
    const sortedCharArray = Array.from(s).sort();
    
    for(let i = 0; i < 26; i++) {
        const alphabet = String.fromCharCode(97 + i);
        const filteredCharArray = sortedCharArray.filter(ch => ch === alphabet);
        
        if(filteredCharArray.length === 1) {
            result.push(alphabet);
        }
    }
    
    return result.join('');
}