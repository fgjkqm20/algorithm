import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{ 
    public static void main(String[] args){ 
        Scanner scanner = new Scanner(System.in);  
        
        List<Integer> A = new ArrayList<Integer>();
        List<Integer> B = new ArrayList<Integer>();
        
        while(scanner.hasNextInt()){
            A.add(scanner.nextInt());
            B.add(scanner.nextInt());
        }
        
        for(int i=0; i<A.size(); i++){
            System.out.println(A.get(i) + B.get(i));
        }
    } 
}
