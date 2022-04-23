import java.util.Scanner;

public class binaryLogic {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		int num3 = num1&num2;
		System.out.println(num3);
	}
}
