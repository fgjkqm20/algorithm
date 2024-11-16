function solution(price, money, count) {
    let total = 0;

    while(count > 0) {
        total += price * count--;
    }
    
    return total >= money ? total - money : 0
}