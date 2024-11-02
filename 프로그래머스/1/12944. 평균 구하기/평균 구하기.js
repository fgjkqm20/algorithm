function solution(arr) {
    return arr.reduce((acc, value) => acc + value, 0) / arr.length;
}