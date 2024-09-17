import java.util.Scanner;

public class TimeTableDemo {
        public static void main(String[]args){
        Scanner input = new Scanner(System.in);


        int n,m;
        System.out.print("Enter Initital number=");
           n = input.nextInt();

        System.out.print("Enter Final number:");
        m = input.nextInt();

        for(int i=m; i<=n; i++){
     
           for(int j=1; j<=10; j++){
          
             System.out.println(i+" x "+j +" = "+i*j);   
          }
             
          System.out.print("\n\n");
      }
   
    }
    
}
