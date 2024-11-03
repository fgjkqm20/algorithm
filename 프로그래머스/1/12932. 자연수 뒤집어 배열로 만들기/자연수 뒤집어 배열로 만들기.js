function solution(n) {
    return String(n).split('').map(ch => +ch).reverse();
}