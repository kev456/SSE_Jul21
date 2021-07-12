package SSE;

public class SSE1_1_4 {

	public static void main(String[] args) {

		// How many rows the triangle has
		int num_row = 5;

		System.out.println("3)");
		
		// For loop to create the full triangle
		for (int i = num_row; i >= 1; i--) {
			for (int j = num_row; j > i; j--) {
				System.out.print(" ");
			}
			
			// if else statement to make first row filled with . and the rest with *
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
