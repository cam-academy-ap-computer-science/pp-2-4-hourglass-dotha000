/* print out top part of hour glass. Print out top hour glass body. Print out center of hour glass. Print out bottom hour glass body. Print out bottom of hour glass body.

*/

public class Hourglass {
	public static final int LINES = 4;
	public static final int MAX = 12;
	public static void main(String[] args) {
		topLine();
		topBody();
	}
	//TOP LINE CODE
	public static void topLine() {
		System.out.print("|");
		for(int i = 1; i <= (MAX - 2); i++) {
			System.out.print("\"");
		}
		System.out.println("|");
	}
	//TOP BODY CODE
	public static void topBody() {
		for(int i = 1; i <= LINES; i++) {
				for(int j = 1; j <= i; j++) {
					System.out.print(" ");
				}
				System.out.print("\\");
				for(int k = 1; k <= -2 * MAX + 34; k++) {
					System.out.print(":");
				}
				System.out.println("/");
		}
	}
}


