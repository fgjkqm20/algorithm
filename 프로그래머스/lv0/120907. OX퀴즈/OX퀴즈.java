class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        int num1;
        char operator;
        int num2;
        String result;
        
        for(int i=0;i<quiz.length; i++){
            int blank = quiz[i].indexOf(' ');
            int equals = quiz[i].indexOf('=');
            
            num1 = Integer.parseInt
                (quiz[i].substring(0, blank));
            operator = quiz[i].charAt(blank+1);
            num2 = Integer.parseInt
                (quiz[i].substring(blank+3, equals-1));
            
            if(operator == '+'){
                result = String.valueOf(num1+num2);
            }else{
                result = String.valueOf(num1-num2);
            }
            
            if(result.equals(quiz[i].substring(equals+2))){
                answer[i] = "O";
            }else{
                answer[i] = "X";
            }
        }
        
        return answer;
    }
}