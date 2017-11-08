/*
Use the Pyhagorean Theorem to
find the length of the hypotenuse
given the lengths of the two opposing sides.
*/
class Hypot {
	public static void main(String args[]) {
	 double x, y, z;

	  x = 3;
	  y = 4;
	  z = Math.sqrt(x*x + y*y);//Math.sqrt is a computer function, similar to System.out.println
	  System.out.println("Hypotenuse is " + z);
	}
}