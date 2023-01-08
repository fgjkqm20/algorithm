import java.util.Scanner;

public class Main{ 
    public static void main(String[] args){ 
        Scanner scanner = new Scanner(System.in); 
        
        int sum = 0;
        int count = scanner.nextInt();
        String numStr = scanner.next();
        
        for(int i=0; i<count; i++){
            sum += numStr.charAt(i) - '0';
        }
        
        System.out.println(sum);
    } 
}