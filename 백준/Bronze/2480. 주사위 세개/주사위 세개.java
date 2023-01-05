import java.util.Scanner;

public class Main{ 
	public static void main(String[] args){
		int[] nums = new int[3];
		Scanner scanner = new Scanner(System.in);

		for(int i=0; i<3; i++){
		    nums[i] = scanner.nextInt();
		}

		int max = 0;
		int count = 0;
		int overlap = 0;
		for(int i=0; i<3; i++){
		    if(max < nums[i]){
			max = nums[i];
		    }

		    for(int j=i+1; j<3; j++){
			if(nums[i] == nums[j]){
			    count++;
			    overlap = nums[i];
			}
		    }
		}

		if(count == 3){
		    System.out.println(10000 + overlap * 1000);
		}else if(count == 1){
		    System.out.println(1000 + overlap * 100);
		}else{
		    System.out.println(max * 100);
		}
	}
}
