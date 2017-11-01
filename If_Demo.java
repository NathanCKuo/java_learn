class If_Demo {
	public static void main(String args[]) {
	  int a, b, c;
	  a = 19;
	  b = 42;
	  System.out.println("a = 19, b = 42");
	  if(a > b) System.out.println("a is greater than b");//will not be displayed beacause a is less than b
	  if(a == b) System.out.println("You won't see this");
	  System.out.println();
	  c = a - b;
	  System.out.println("c = a - b");
	  if(c < 0) System.out.println("c is a negative integer " + c);
	  if(c >= 0) System.out.println("c is a positive integer " + c);
	  System.out.println();
	  c = a + b;
	  if(c >= 0) System.out.println("c is a positive integer " + c);
	  if(c < 0) System.out.println("c is a negative integer " + c);
	}
}
