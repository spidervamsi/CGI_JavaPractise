import java.util.*;
import java.io.*;
public class Pe8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int g,x,i=11;
		x=90;
		Scanner reader=new Scanner(System.in);
		while(i>10) {
			g=reader.nextInt();
			
			if(g==x) {
				i=0;
				System.out.println(" Number guessed matches the original number");
			}
			else if(g>x)
				System.out.println(" Number guessed is more than original number ");
			else
				System.out.println(" Number guessed is less than original number ");
			
		}

	}

}
