const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = [line];
}).on('close',function(){
    str = input[0];
    let answer = ''
    
    for(let i = 0; i < str.length; i++) {
        const ch = str.charAt(i);
        if(ch >= 'a' && ch <= 'z') {
            answer += ch.toLocaleUpperCase();
        } else if(ch >= 'A' && ch <= 'Z') {
            answer += ch.toLocaleLowerCase()
        }
    }
    
    console.log(answer);
});