package SSE;

// @author kevinkim

public class SSE1_1_3 {

	public static void main(String[] args) {

		// How many rows the triangle has
		int num_row = 5;

		// For loop to create the full triangle
		for (int i = 1; i <= num_row; i++) {
			for (int j = i; j < num_row; j++) {
				System.out.print(" ");
			}
			
			// if else statement to make the full triangle filled with * and last row filled with .
			if (i != num_row) {
				for (int k = 1; k < (i * 2); k++) {
					System.out.print("*");
				}
			} else {
				for (int k = 0; k < (i * 2); k++) {
					System.out.print(".");
				}
			}

			System.out.println();

		}
	}

}
