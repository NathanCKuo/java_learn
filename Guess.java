//Guess the number game.

public class Guess {
	public static void main(String args[]) 
	  throws java.io.IOException {
	  char ch, answer = 'K';

	  
	  System.out.println("I am thinking of a capital letter between A to Z.");
	  System.out.print("Can you guess it?");
	  ch = (char) System.in.read();
	  if(ch == answer) System.out.println("<<Right!>>");
	  else System.out.println("...Sorry, you're wrong.");
	}
}
