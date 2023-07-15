package Test;
import java.util.random.*;
import java.util.Random;
import java.util.Scanner;
public class Guessing 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int guess,answer;
		
		int MAX=100;
		
		int cnt=0;
		
		Scanner sc=new Scanner(System.in);
		 Random rand=new Random();   
		   answer=rand.nextInt(MAX)+1;
		   System.out.println("Guess Number between 0 to 100:\nYou have only five attempts:");
		   while(cnt!=5)
		   {
			   cnt ++;
		     guess=sc.nextInt();
             if(guess==answer)	 
             { 
            	 System.out.println("Correct"); 
             }
             else if(guess>answer) 
             { 
            	 System.out.println("Enter low Number:");
             }
             else if(guess<answer)
             {
            	 System.out.println("Enter high Numer:");
             }
             if(cnt==1 & guess==answer)
             {
		    	 System.out.println("You got 10 out of 10");
		     }
             else if(cnt==2 & guess==answer) 
             {
            	 System.out.println("You got 10 out of 8");
             }
             else if(cnt==3 & guess==answer) 
             {
            	 System.out.println("You got 10 out of 6");
             }
             else if(cnt==4 & guess==answer) 
             {
            	 System.out.println("You got 10 out of 4");
             }
             else if(cnt==5 & guess==answer) 
             {
            	 System.out.println("You got 10 out of 2");
             }
             else if(cnt==5 & guess!=answer)
             {
            	 System.out.println("OOPS OUT OF ATTEMPTS");
             }
		   }
	}         
}
            
                     
