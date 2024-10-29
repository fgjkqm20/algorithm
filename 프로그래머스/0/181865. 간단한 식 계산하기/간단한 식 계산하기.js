function solution(binomial) { 
    let [num1, operator, num2] = binomial.split(' ');
    num1 = Number.parseInt(num1);
    num2 = Number.parseInt(num2);
    
    switch(operator) {
        case '+':
            return num1 + num2;
        case '-':
            return num1 - num2;
        case '*':
            return num1 * num2;
    }
}