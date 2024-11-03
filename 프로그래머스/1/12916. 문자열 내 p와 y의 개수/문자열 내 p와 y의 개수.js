function solution(s){
    let p = 0;
    let y = 0;
    
    for(let i = 0; i < s.length; i++) {
        const ch = s.charAt(i);
        
        if(ch === 'p' || ch === 'P') {
            p++;
        } else if(ch === 'y' || ch === 'Y') {
            y++;
        }
    }

    return p === y || p + y === 0;
}