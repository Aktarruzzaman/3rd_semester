//Assignment: 16

import java.util.Scanner;
public class UsernameAssi16 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        
      
            for(int i=1; i<10; i++)
            {
            System.out.println("Enter any Username");
            String username = input.next();
         
            System.out.println(" Enter any Password");
           int password= input.nextInt();
            
        if(username.equals("rifat") && password == 123456)
        {
             System.out.println("Welcome to the system");
               break;
        }
        else
        
            System.out.println("Username/password is incorrect");

        } 
            

    }
}
