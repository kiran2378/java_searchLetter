
import java.util.Scanner;

public class substring1 {

	
public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 String str;
	 char letter;
	 
	  System.out.println("Enter any Sentence : ");
      str = scan.nextLine();
      
      System.out.println("Enter Letter : ");
      letter = scan.next().charAt(0);
      
      int length = str.length();
      
      for(int i = 0 ; i<length ; i++)
    	  
      {
	 
    	  char letter2 = str.charAt(i);
    	  if (letter == letter2);
    	  
    	  {
    		  System.out.println(str.substring(i+1));
    		  break;
    	  }
	  }
	 
	  

	}

}
