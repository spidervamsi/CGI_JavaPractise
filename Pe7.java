import java.util.*;
import java.io.*;
import java.util.Arrays;

public class Pe7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		String str;
		char c[];
		str=reader.nextLine();
//		System.out.println(str);
		int i,n,l,j,count=0;
		char p,q;
		l=str.length();
		c=str.toCharArray();
		for(i=0;i<l;i++) {
			for(j=i+1;j<l;j++) {
				if(c[i]<c[j]) {
					p=c[i];
					c[i]=c[j];
					c[j]=p;
//					str.replace(i,j);
				}
			}
		}
		
//		System.out.println(c);
		
		for(i=0;i<l;i++) {
		n=Character.getNumericValue(c[i]);
		if(n%2==0)
			count=count+n;
//		System.out.println(n+"  "+count);
		}
		
		System.out.println("Sum of the even numbers "+count);
		if(count>15)
			System.out.println("true");
		else
			System.out.println("false");
			
		
		
		
		
		
		
		
		
		
		
	}

}
