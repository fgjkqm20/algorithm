function solution(array, n) {
    // 배열의 각 요소와 n를 뺀 값의 절대값들을 저장한 배열
    const x = array.map(num => Math.abs(num - n));
    // 배열에서 가장 가장은 값
    const min = Math.min(...x);
    
    let x2 = [];
    for(let i = 0; i < x.length; i++) {
        if(x[i] === min) {
            x2.push(array[i]);
        }
    }
    
    return Math.min(...x2);
}