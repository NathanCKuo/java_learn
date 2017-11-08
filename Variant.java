//Variations of Hypot.java program and experimentation.

class Variant {
	public static void main(String args[]) {
	  double x, y, z;
	  double xyz, coffee;
	  int cup;
	  x = 5;
	  y = 14;
	  z = Math.sqrt(x*x + y*y);
	  xyz = x*y*z;
	  coffee = y/x;
	  System.out.println("Hypotenuse is " + z);
	  System.out.println("x times y times z is equal to " + xyz);
	  System.out.println("coffee is equal to " + coffee);
	}
}
	  
/*Apparently, you can't place double variables inside long variables. 
For example, if I place this in a block:  double x,y,z;
	  				  long xyz;
	  				  x = 5;
	  				  y = 14;
	  				  z = Math.sqrt(x*x + y*y);
	  				  xyz = x*y*z;
The computer will give you this feedback:
 error: incompatible types: possible lossy conversion from double to long
          xyz = x*y*z;
                         
*/
							
