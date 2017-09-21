import java.util.*;
import java.io.*;
public class Pe10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader= new Scanner(System.in);
		String str,y;
		char c[];
		int i,j,x,n,l;
		str=reader.nextLine();
		c=str.toCharArray();
		n=reader.nextInt();
		l=str.length();
		
		for(i=0;i<n;i++)
		str=str+str.substring(l-n, l);
		
		System.out.println(str);

	}

}
