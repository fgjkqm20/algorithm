function solution(my_string, s, e) {
    let str1 = my_string.slice(0, s);
    let str2 = my_string.slice(s, e+1);
    let str3 = my_string.slice(e+1, my_string.length);
    
    str2 = Array.from(str2).reverse().join('');
    
    return str1 + str2 + str3;
}