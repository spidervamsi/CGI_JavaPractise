import java.util.*;
//import java.io.*;



public class Pe6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		char c;
		int x;
		c=reader.next(".").charAt(0);
		x=c;
//		System.out.println("this is my char : "+c+" asci2 value is "+x);
		
		if(65<=x && x<=90) {
			System.out.println("CAPITAL LETTER");
		}
		else if((97<=x )&& (x<=122)) {
			System.out.println("small LETTER");
		}
		else if((48<=x) && (x<=57)) {
			System.out.println("Number");
		}
		else if((33<=x && x<=47)||(58<=x && x<=64)) {
			System.out.println("Special Char");
		}
		
		
		
	}

}
