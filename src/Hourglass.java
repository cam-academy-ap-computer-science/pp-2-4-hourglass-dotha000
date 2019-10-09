/* print out top part of hour glass. Print out top hour glass body. Print out center of hour glass. Print out bottom hour glass body. Print out bottom of hour glass body.

*/

public class Hourglass {
	public static final int LINES /* of the glass */ = 1;
	public static final int LENGTH = 2 * LINES + 2;
	public static void main(String[] args) {
		topLine();
		topBody();
		botBody();
		topLine();
	}
	//TOP LINE CODE
	public static void topLine() {
		System.out.print("|");
		for(int i = 1; i <= (LENGTH); i++) {
			System.out.print("\"");
		}
		System.out.println("|");
	}
	//TOP GLASS CODE
	public static void topBody() {
		for(int i = 1; i <= LINES; i++) {
			//PRINT SPACES
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			//PRINT GLASS
			System.out.print("\\");
			for(int k = 1; k <= LENGTH - 2 * i; k++) {
				System.out.print(":");
			}
			System.out.println("/");
		}
		//PRINT CENTER
		for(int i = 1; i <= LINES + 1; i++) {
			System.out.print(" ");
		}
		System.out.println("||");
	}
	//BOTTOM GLASS CODE
	public static void botBody() {
		for(int i = 1; i <= LINES; i++) {
			//PRINT SPACES
			for(int j = 1; j <= -1 * i + LINES + 1; j++) {
				System.out.print(" ");
		}
		//PRINT GLASS
		System.out.print("/");
		for(int k = 1; k <= -1 * LENGTH + 2 * i + 2 * LINES + 2; k++) {
			System.out.print(":");
		}
		System.out.println("\\");
		}
	}
}


