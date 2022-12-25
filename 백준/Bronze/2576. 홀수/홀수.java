import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
        
        int num = 0;
        int sum = 0;
        int min = 0;
        for(int i=0; i<7; i++){
            num = scanner.nextInt();
            if(num%2 == 1){
                sum += num;
                
                if(min == 0 || min > num){
                    min = num;
                }
            }
        }
        
        if(sum == 0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
	}
}