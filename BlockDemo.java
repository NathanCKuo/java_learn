/*
code
naming this file BlockDemo.java because the book said so
*/
class BlockDemo{
	 public static void main(String args[]) {
	  double i, j, d;

	  i = 5;
	  j = 10;
	  
	  //The following code is a block
	  if(i != 0) {
	    System.out.println("i doesn't equal zero");
	    d = j / i;
	    System.out.println("j / i is " + d);
    }
  }
}