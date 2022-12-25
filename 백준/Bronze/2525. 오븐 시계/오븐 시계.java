import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
        
        int hour1 = scanner.nextInt();
        int minute1 = scanner.nextInt();
        int cook = scanner.nextInt();
        
        int hour2 = hour1;
        int minute2 = minute1 + cook;
        
        if(minute2 >= 60){
            hour2 += minute2/60;
            minute2 %= 60;
            
            if(hour2 >= 24){
                hour2 -= 24;
            }
        }
        
        System.out.println(hour2 + " " + minute2);
	}
}