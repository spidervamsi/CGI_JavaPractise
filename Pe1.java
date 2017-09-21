import java.util.*;
import java.io.*;

public class Pe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		String str;
		System.out.print("Enter the string :");
		str=reader.nextLine();
		System.out.print("Enter the string :"+str);
		int len,i,flag=0,n;
		int e,count=0;
		char p;
		len=str.length();
		e=len;
		for(i=0;i<len;i++) {
			len--;
			if(str.charAt(i)!=str.charAt(len)) {
				flag=1;
				break;
			}
//			System.out.println(str.toCharArray()[i]);
		}
		if(flag==0)
		System.out.println("This is a palindrome");
		else
         System.out.println("This is not a palindrome");
	
	
	while(e!=0) {
		
	p=str.charAt(i);
		n=Integer.parseInt(p);
		
	}
	
//	System.out.println(count);  
	if(count >25)
		System.out.println("and the sum of even numbers is greater than 25");
	else
		System.out.println("and the sum of even numbers is less than 25");
	
	
	
}