//hello this is project1
package beammachine1;
import java.util.Scanner;


public class project1mannab {
// this is manish
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		// Let the user to enter the number of the balls
		System.out.print("Enter the number of balls: ");
		int Balls = input.nextInt();

		// Let the user to enter the number of slots
		System.out.print("Enter the number of slots in the bean machine: ");
		int nails = input.nextInt() - 1;

		System.out.print("The number of balls entered are: "+ Balls);
		
		String[] paths = new String[nails * Balls];
		int[] balls = new int[nails]; 

		int numberOfRs = 0; 
		for (int i = 0; i < paths.length; i++) {
			paths[i] = getRandomPath();
			if (paths[i] == "Right, ") {
				numberOfRs++; 
			}

			//Number of balls
			if ((i + 1) % nails == 0) {
				balls[numberOfRs]++; 
				numberOfRs = 0;
			}
		}	
		print(paths, nails);
		print(balls);
	}
	public static String getRandomPath() {
		if ((int)(Math.random() * 2) == 0)
			return "Left, ";
		else
			return "Right, ";
	}
	public static void print(String[] list, int n) {
		System.out.println();
		for (int i = 0; i < list.length; i++)
			System.out.print(((i + 1) % n == 0) ? list[i] + "\n" : list[i]);
	}
	public static void print(int[] list) {
		int max = max(list);
		
		while (max > 0) {
			System.out.println();
			for (int i = 0; i < list.length; i++) {
				if (list[i] >= max) {
					System.out.print("O");
				}
				else
					System.out.print(" ");
			}
			max--;
		}
		System.out.println();
	}

	public static int max(int[] list) {
		int max = list[0];

		
		
		System.out.print("The number of balls are: ");
		
		for (int i = 1; i < list.length; i++) {
			if (list[i] > max)
				max = list[i];
		}
		return max;
	}




	}

