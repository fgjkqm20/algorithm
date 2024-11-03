function solution(x) {
    return x % String(x).split('').reduce((acc, value) => acc + +value, 0) === 0;
}