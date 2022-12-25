import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
        
        int num = 0;
        int max = 0;
        int index = 0;
        for(int i=1; i<=9; i++){
            num = scanner.nextInt();

            if(max < num){
                max = num;
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index);
	}
}