function solution(number) {
    let numChars = number.split('');
    
    let sum = 0;
    for(let numChar of numChars) {
        sum += +numChar;
    }
    
    return sum % 9;
}