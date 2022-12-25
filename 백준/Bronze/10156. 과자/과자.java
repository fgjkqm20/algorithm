import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
        
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        if(K*N-M >= 0){
            System.out.println(K*N-M);
        }else{
            System.out.println(0);
        }
	}
}