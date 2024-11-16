function solution(matrix1, matrix2) {
    let answer = []
    
    const length = matrix1[0].length;
    
    const arr1 = matrix1.flat();
    const arr2 = matrix2.flat();
    
    let x = [];
    for(let i = 0; i < arr1.length; i++) {
        x.push(arr1[i] + arr2[i]);
        
        if(x.length === length) {
            answer.push(x);
            x = [];
        }
    }
    
    return answer;
}