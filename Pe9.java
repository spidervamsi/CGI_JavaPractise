import java.util.*;
import java.io.*;
import java.util.Arrays;

public class Pe9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader=new Scanner(System.in);
		char c[],p;
		String str;
		int i,n;
		
		str=reader.nextLine();
		n=str.length();
       c=str.toCharArray();
       n--;
       for(i=0;i<n;i++) {
    	   p=c[i];
    	   c[i]=c[n];
    	   c[n]=p;
    	   n--;
       }
       
       System.out.println(c);
		
	}

}
