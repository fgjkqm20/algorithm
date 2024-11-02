function solution(before, after) {
    let arr1 = before.split('').sort();
    let arr2 = after.split('').sort();
    
    for(let i = 0; i < before.length; i++) {
        if(arr1[i] !== arr2[i]) {
            return 0;
        }
    }
    
    return 1;
}