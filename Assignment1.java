import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l=1;
		SecureRandom i= new SecureRandom();
		Integer y=i.nextInt(50)+1;
		while(true){
			
			
		Scanner input=new Scanner(System.in);
		
		System.out.println("Guess a number");
		Integer x=input.nextInt();
        
       if(getRandom(y, x)){
    	   System.out.println("You won the range is within "+(y-10) + " or "+(y+10));
    	   break;
      
		}if(l==5){
                    System.out.println("you lost! ");
                    break;
                }
                l++;
		}
       
	}
	static boolean getRandom(int y,int x){
		if(x>y-10&&x<=y+10){
        	return true;
        }else{
        	return false;
        }
		
	 } 

}
