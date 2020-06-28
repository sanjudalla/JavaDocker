

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class number {


	
	public static boolean numberformat(String input) {
		try {
		Integer.parseInt(input);
		System.out.println("integer");
		}
		catch(NumberFormatException e){
			System.out.println("not number");
		return false;
		}
		return true;
	}
	
	public static void calc(int num1,char c,int num2) {
		int x=num1 +c+num2;
		System.out.println(x);
	}

	public static void main(String[] args) throws IOException {
		//calc(6,+,6);
		//check input is integer or not
		
		/*Scanner sc=new Scanner(System.in);
		String userInput=sc.next();
		numberformat(userInput);*/
				
		//Launch application
		//Runtime.getRuntime().exec("notepad.exe");
		
		//reverse of string
		String revString="liril";
		reverse(revString);
		
		//duplicate removal
		/*String[] arrDup=new String[] {"test","its","duplicate","test"};	
		duplicateRemoval(arrDup);*/
		
		//remove space
		/*String space="I am without space";
		String withoutSpace=space.replaceAll("\\s", "");
		System.out.println(withoutSpace);*/
		
		//common in array
		/*String[] arrComm1=new String[] {"test","its","common","test"};
		String[] arrComm2=new String[] {"test1","its1","common","test"};
		common(arrComm1,arrComm2);*/
		
		//missing number
		/*Integer[] arrmissing=new Integer[] {1,2,3,5,6,7,8,9,10};
		missingArray(arrmissing);
		*/
		
		/*//Array equals
		String[] arrComm1=new String[] {"test","its","common","test"};
		String[] arrComm2=new String[] {"test","its","common","test"};
		equals(arrComm1,arrComm2);
		System.out.println("i m javasample");*/
		
	}

	private static void equals(String[] arrComm1, String[] arrComm2) {
		System.out.println(Arrays.equals(arrComm1,arrComm2));
	}

	private static void missingArray(Integer[] arrmissing) {
		int sum=0;
		for(Integer i:arrmissing) {
			sum=sum+i;
		}
		System.out.println(sum);
		int n=10;
		int sumOfelements=(n*(n+1))/2;
		int missingElement=sumOfelements-sum;
		System.out.println("missing is : "+ missingElement);
		
	}

	private static void common(String[] arrComm1, String[] arrComm2) {
		HashSet<String> common=new HashSet<String>();
		for(String s:arrComm1) {
			for(String s1:arrComm2) {
				if(s.equals(s1)) {
					common.add(s);
				}
			}
		}
		System.out.println(common);
	}

	private static void duplicateRemoval(String[] arrDup) {
		HashSet<String> removedup=new HashSet<String>();
		for(String s:arrDup) {
		if(!removedup.add(s))
			System.out.println(s+" : is duplicate");
		}
	}

	public static void reverse(String s) {
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}
	}
	
	
}
