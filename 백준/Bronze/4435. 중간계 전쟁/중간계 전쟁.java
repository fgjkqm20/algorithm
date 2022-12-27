import java.util.Scanner; 

public class Main{ 
	public static void main(String[] args){ 
		Scanner scanner = new Scanner(System.in); 
        
        int[] gandalfScore = { 1, 2, 3, 3, 4, 10 }; // 간달프 각 종족 점수
        int[] sauronScore = { 1, 2, 2, 2, 3, 5, 10 }; // 사우론 각 종족 점수
        
        int T = scanner.nextInt(); // 전투의 개수
        int[][] gandalfNum = new int[T][6]; // 간달프 수
        int[][] sauronNum = new int[T][7]; // 사우론 수
        
        int[] gandalfSum = new int[T]; // 간달프 점수 합
        int[] sauronSum = new int[T]; // 사우론 점수 합
        
        for(int i=0; i<T; i++){
            for(int j=0; j<6; j++){
                gandalfNum[i][j] = scanner.nextInt();
                gandalfSum[i] += gandalfNum[i][j] * gandalfScore[j];
            }
            for(int j=0; j<7; j++){
                sauronNum[i][j] = scanner.nextInt();
                sauronSum[i] += sauronNum[i][j] * sauronScore[j];
            }
        }
        
        for(int i=0; i<T; i++){
            System.out.print("Battle " + (i+1) + ": ");
            
            if(gandalfSum[i] > sauronSum[i]){
                System.out.println("Good triumphs over Evil");
            }else if(gandalfSum[i] == sauronSum[i]){
                System.out.println("No victor on this battle field");
            }else if(gandalfSum[i] < sauronSum[i]){
                System.out.println("Evil eradicates all trace of Good");
            }
        }
	} 
}