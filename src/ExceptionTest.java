//import java.io.*;
import java.util.*;
public class ExceptionTest {
	public static void main(String[] args){
		int num = 0;
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		try{
			num = Integer.parseInt(s);
		}
		catch(NumberFormatException e){
			System.out.println("Bad string");
			//return;
		}
		System.out.println(num);
	}
}
