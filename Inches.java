/*
number of cubic inches in one cubic mile
*/
class Inches {
	public static void main(String args[]) {
	  long ci;
	  long in;//long means long integer

	  in = 5280 * 12;
	  ci = in * in * in;

	  System.out.println("There are " + ci + " cubic inches in cubic mile.");
	}
}