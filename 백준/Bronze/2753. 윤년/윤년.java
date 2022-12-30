import java.util.Scanner;

public class Main{ 
    public static void main(String[] args){ 
        Scanner scanner = new Scanner(System.in);  
        
        int result = 0;
        int year = scanner.nextInt();
        
        if(year%4 == 0){
            if(year%100 != 0 || year%400 == 0){
                result = 1;
            }
        }
        
        System.out.println(result);
    } 
}