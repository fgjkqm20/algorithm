function solution(n) {
    let x = Math.sqrt(n);
    
    if(x === Math.floor(x)) {
        return (x + 1) ** 2;
    }
    
    return -1;
}