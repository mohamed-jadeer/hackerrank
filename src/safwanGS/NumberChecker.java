package safwanGS;

import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbArray = new int[100];
		
		int size;
		
		Scanner inpubufobj = new Scanner(System.in);
		System.out.println("Enter Size of the Array");
		size = inpubufobj.nextInt();
		
		System.out.println("Enter array elements");
		for(int i=0 ; i < size ; i++){
			numbArray[i] = inpubufobj.nextInt();
		}
		inpubufobj.close();
		
		String res = findQualifiedNumbers(numbArray);
		
		System.out.println(res);

	}

	static String findQualifiedNumbers(int[] numberArray) {
        int size=numberArray.length;
        int[] quaifiedNumbArray = new int[size];
		int j = 0;
		StringBuffer tempresult=new StringBuffer();
		String result;
		boolean f=false;
		
		for(int i = 0 ; i < size ; i++){
			String tempNum = String.valueOf(numberArray[i]);
			if(tempNum.contains("1") && tempNum.contains("2") && tempNum.contains("3")){
				quaifiedNumbArray[j] = numberArray[i];f=true;
				j++;
			}
		}
		
		Arrays.sort(quaifiedNumbArray);

		for(int i = 0 ; i < size ; i++){
			if(quaifiedNumbArray[i] != 0){
				tempresult=tempresult.append(String.valueOf(quaifiedNumbArray[i]));
				tempresult.append(",");
			}
		}
		
		if(tempresult != null){
			tempresult.deleteCharAt(tempresult.lastIndexOf(","));
		}
		result = tempresult.toString();
		if(f)
		return result;
        else
            return"-1";
    }
}
