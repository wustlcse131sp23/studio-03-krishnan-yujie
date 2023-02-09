package studio3;
import java.util.Scanner;
import java.util.Arrays;
public class Sieve {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is n?");
		int n = in.nextInt();
		int[][] allNumbers = new int[2][n-1];
		
		for (int i=0; i<n-1; i++)
		{
			allNumbers[0][i]=i+2;
//			allNumbers[][i]=i+2;
		}
		for (int i = 0; i<2; i++) {
			for (int j=0; j<n-1; j++) {
				System.out.println(allNumbers[i][j]+ " ");
		
			}
			System.out.println();
		
		}
		int currentNum = 2;
		int count = 1;
		for (int i= 0; i<n-1; i++) {
			currentNum = allNumbers[0][i];
			if (allNumbers[1][i] == 0) {
				allNumbers[1][i] = 1;
				while (currentNum*count<=n) {
					if (allNumbers[1][currentNum*count-2] ==0) {
						allNumbers[1][currentNum*count-2]=2;
					}
					count++;
				}
			}
			
			
		}
		for (int i = 0; i<2; i++) {
			for (int j=0; j<n-1; j++) {
				System.out.println(allNumbers[i][j]+ " ");
		
			}
			System.out.println();
		
		}
		
	}
}