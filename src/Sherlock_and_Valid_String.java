import java.util.Scanner;
import java.util.Arrays;

public class Sherlock_and_Valid_String {
	public static void main(String[] args) {
		String msg;
		int[] freq = new int[26];
		Scanner rdbuf = new Scanner(System.in);
		msg = rdbuf.nextLine();
		rdbuf.close();
		for(int i=0 ; i < msg.length() ; i++){
			freq[(int)(msg.charAt(i))-97]++;
		}
		int count=0;
		for(int i=0 ; i < 26 ; i++){
			//System.out.println((char) (i+97) + "=" + freq[i]);
			if(freq[i] != 0){
				count++;
			}
		}
		int[] newarr = new int[count];
		int j=0;
		for(int i=0 ; i < freq.length ; i++){
			if(freq[i] != 0){
				newarr[j] = freq[i];
				j++;
			}
		}
		Arrays.sort(newarr);
		for(int i=0 ; i < newarr.length-1 ; i++){
			if(newarr[0] == 1){
				if(newarr[1] == newarr[newarr.length-1]){
					System.out.println("YES");
					return;
				}
				else{
					System.out.println("NO");
					return;
				}
			}
			else if(newarr[i] == newarr[i+1]){
				continue;
			}
			else if( (newarr[i+1] == newarr[i]+1) && (i+1 == newarr.length-1))
				continue;
			else{
				System.out.println("NO");
				return;
			}
			//System.out.println(newarr[i]);
		}
		System.out.println("YES");
		//System.out.println(msg);
	}

}