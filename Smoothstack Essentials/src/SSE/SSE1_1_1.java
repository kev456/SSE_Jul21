package SSE;

// @author kevinkim
public class SSE1_1_1 {
	public static void main(String[] args) {

		// How many rows the triangle has
		int num_row = 5;

		// For loop to create right triangle made up of *
		for (int i = 1; i <= num_row; ++i) {
			
			// if else statement for making the triangle filled with * and the last row as .
			if (i != num_row) {
				for (int j = 1; j <= i; ++j) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j < 10; j++) {
					System.out.print(".");
				}
			}

			System.out.println();
		}

	}

}
