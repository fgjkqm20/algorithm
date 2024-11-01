function solution(arr, flags) {
    let answer = [];
    
    flags.forEach((flag, index) => {
        if(flag) {
            for(let i = 0; i < arr[index]*2; i++) {
                answer.push(arr[index]);
            }
        } else {
            for(let i = 0; i < arr[index]; i++) {
                answer.pop();
            }
        }
    })
    
    return answer;
}