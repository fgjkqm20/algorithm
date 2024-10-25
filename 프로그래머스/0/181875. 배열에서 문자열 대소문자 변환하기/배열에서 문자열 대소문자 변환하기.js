function solution(strArr) {
    let answer = [];
    
    strArr.forEach((str, index) => {
       if(index % 2 === 1) {
           answer[index] = str.toLocaleUpperCase();
       } else {
           answer[index] = str.toLocaleLowerCase();
       }
    });
    
    return answer
}