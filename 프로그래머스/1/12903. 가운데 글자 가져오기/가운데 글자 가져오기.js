function solution(s) {
    const l = s.length;
    
    if(l === 1) {
        return s;
    }
    
    if(l % 2) {
        return s.charAt(l / 2);
    }
    
    return s.substring(l / 2 - 1, l / 2 + 1);
}