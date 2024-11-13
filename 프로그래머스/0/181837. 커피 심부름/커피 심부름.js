function solution(orders) {
    let answer = 0;
    
    orders.forEach(order => {
        if(order.includes('americano')) {
            answer += 4500;
        } else if(order.includes('cafelatte')) {
            answer += 5000;
        } else if(order.includes('anything')) {
            answer += 4500;
        }
    })
    
    return answer;
}