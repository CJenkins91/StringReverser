import java.util.Scanner;

public class StringReverser {
	
	public static String StringReverse(){ 
	Scanner input = new Scanner(System.in);
	String userString = input.next();
	input.close();
	String tempString = ""; 
	
	for(int i=userString.length()-1;i>=0 ; i--){
		tempString += userString.charAt(i); 
	}
	
	userString = tempString;
	return userString;
	}
	
	public static void main(String[] args){
		String result = StringReverse();
		System.out.println("Here is the result:" + result);
	}
	
}
