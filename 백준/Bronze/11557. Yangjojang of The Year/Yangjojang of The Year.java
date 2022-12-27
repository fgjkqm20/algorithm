import java.util.Scanner;

class School{
    private String schoolName; // 학교 이름
    private int alcoholSpend; // 지난 한 해동안 소비한 술의 양
    
    public School(String schoolName, int alcoholSpend){
        this.schoolName = schoolName;
        this.alcoholSpend = alcoholSpend;
    }
    
    public String getSchoolName(){
        return this.schoolName;
    }
    
    public int getAlcoholSpend(){
        return this.alcoholSpend;
    }
}

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt(); // 테스트 케이스의 숫자
        School[][] schools = new School[T][];
        
        for(int i=0; i<T; i++){
            int N = scanner.nextInt(); // 학교의 숫자 정수
            schools[i] = new School[N];
            
            for(int j=0; j<N; j++){
                String schoolName = scanner.next();
                int alcoholSpend = scanner.nextInt();
                
                schools[i][j] = 
                    new School(schoolName, alcoholSpend);
            }
        }
        
        for(int i=0; i<T; i++){
            int maxIndex = 0;
            
            for(int j=1; j<schools[i].length; j++){
                int alcoholSpend1 = 
                    schools[i][maxIndex].getAlcoholSpend();
                int alcoholSpend2 = 
                    schools[i][j].getAlcoholSpend();
                
                if(alcoholSpend1 < alcoholSpend2){
                    maxIndex = j;
                }
            }
            
            System.out.println(schools[i][maxIndex].getSchoolName());
        }
    }
}