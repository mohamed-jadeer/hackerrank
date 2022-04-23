import java.io.*;
import java.util.*;

public class prime {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int[] testNum = new int[testCases];
        for(int i=0; i < testCases ; i++){
        	testNum[i] = sc.nextInt();
        }
        int flag=1,j=0;
        while(j < testCases){
        	flag = 1;
        	for(int i = 2 ; i < Math.ceil(Math.sqrt(testNum[j])) ; i++){
        		if(testNum[j] % i == 0){
        			flag = 0;
        			break;
        		}
        		else
        			continue;
        	}
        	if(flag == 0){
        		System.out.println("Not Prime");
        	}
        	else
        		System.out.println("Prime");
        	j++;
        }
        sc.close();
    }
}