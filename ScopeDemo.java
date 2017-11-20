//Demonstrate block scope.
class ScopeDemo {
	  public static void main(String[] args) {
	  int x; //This variable is known to all code

	  x = 10;
	  if(x == 10) { //This starts a new scope
	    int y = 20; //Known to this block
	  //x and y are known here
	    System.out.println("x and y: " + x + " " + y);
	    x = y * 2;
	  }
	  System.out.println("x is " + x);
	}
}