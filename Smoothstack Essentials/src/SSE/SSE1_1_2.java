package SSE;

//@author kevinkim

public class SSE1_1_2 {

	public static void main(String[] args) {

		// Number of rows that the triangle has
		int num_row = 5;

		System.out.println("2)");
		
		// For loop to create a descending right triangle
		for (int i = num_row; i >= 1; --i) {
			
			// if else statement for first line to be made up of . while the rest of the triangle is *
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
