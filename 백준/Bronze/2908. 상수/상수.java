import java.util.Scanner;

public class Main{ 
    public static void main(String[] args){ 
        Scanner scanner = new Scanner(System.in);  
        
        char[] digits1 = scanner.next().toCharArray();
        char[] digits2 = scanner.next().toCharArray();
        
        int reverseNum1 = (digits1[0]-'0')*1 + (digits1[1]-'0')*10 + (digits1[2]-'0')*100;
        int reverseNum2 = (digits2[0]-'0')*1 + (digits2[1]-'0')*10 + (digits2[2]-'0')*100;
        
        if(reverseNum1 > reverseNum2){
            System.out.println(reverseNum1);
        }else{
            System.out.println(reverseNum2);
        }
    } 
}