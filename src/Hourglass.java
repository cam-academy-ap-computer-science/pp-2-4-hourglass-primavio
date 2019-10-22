/*line 1= vertical line, 10" vertical line/ lines 2-5= for loop/ line 6= 2 vertical lines/ 
 * lines 7-10= for loop2/ line 11= line 1*/

public class Hourglass {
	public static final int WIDTH = 4;
	public static void main(String[] args) {
		base();
		topHalf();
		middle();
		botHalf();
		base();
	}
	// base is same for top and bottom/ two vertical lines with 10" in between//
	public static void base() {
		System.out.print("|");
		for (int i = 1; i <= 10; i++) {
			System.out.print("\"");
		}
		System.out.println("|");
	}

	//topHalf is increased space, slash,::, slash//
	public static void topHalf() {
		for (int line = 1; line <= WIDTH; line++) {
			for (int space = 1; space <= line; space++) {
				System.out.print(" ");
			}
			for (int dash = 1; dash <= 1; dash++) {
			System.out.print("\\");
			}
			for (int dots = 1; dots <= 5 - line; dots++) {
			System.out.print("::");
			}
			for (int slash = 1; slash <= 1; slash++) {
			System.out.print("/");
			}
		System.out.println();
		}
	}
	
	
	// middle is 2 vertical lines	
	public static void middle() {
		System.out.println("     ||");
	}
	
	// bottom half is nested for loop of top half but reversed//
	public static void botHalf() {
		for (int line = 1; line <= WIDTH; line++) {
			for (int space = 1; space <= 5 - line; space++) {
				System.out.print(" ");
			}
			for (int dash = 1; dash <= 1; dash++) {
			System.out.print("/");
			}
			for (int dots = 1; dots <= line; dots++) {
			System.out.print("::");
			}
			for (int slash = 1; slash <= 1; slash++) {
			System.out.print("\\");
			}
		System.out.println();
		}
	}
}
	