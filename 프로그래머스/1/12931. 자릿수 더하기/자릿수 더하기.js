function solution(n) {
    let numArr = String(BigInt(n)).split('');

    return numArr.reduce((accumulator, currentValue) => accumulator + +currentValue, 0);
}