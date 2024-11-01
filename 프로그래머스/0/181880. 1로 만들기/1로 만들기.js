function solution(num_list) {
    let answer = 0;
    
    for(let num of num_list) {
        while(num !== 1) {
            if(num % 2 === 1) {
                num -= 1;
            }
            
            num = Math.floor(num / 2);
            answer += 1;
        }
    }
    
    return answer;
}