import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int date = scanner.nextInt();
        for(int i=0; i<5; i++){
            if(scanner.nextInt() == date){
                count++;
            }
        }
        
        System.out.println(count);
	}
}