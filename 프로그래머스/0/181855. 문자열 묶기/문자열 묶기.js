function solution(strArr) {
    var answer = 0;
    
    const lengthArr = strArr.map(str => str.length);
    const maxLength = Math.max(...lengthArr);
    
    let xx = [];
    
    for(let i = 1; i <= maxLength; i++) {
        const x = lengthArr.filter(length => length === i);
        
        xx.push(x.length);
    }
    
    return Math.max(...xx);
}