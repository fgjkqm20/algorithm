import java.util.Scanner;

public class Main{ 
    public static void main(String[] args){ 
        Scanner scanner = new Scanner(System.in);  
        
        int T = scanner.nextInt();
        int[] A = new int[T];
        int[] B = new int[T];
        
        for(int i=0; i<T; i++){
            A[i] = scanner.nextInt();
            B[i] = scanner.nextInt();
        }
        
        for(int i=0; i<T; i++){
            System.out.println(A[i] + B[i]);
        }
    } 
}