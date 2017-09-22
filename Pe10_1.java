import java.util.*;
import java.io.*;

public class Pe10_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		  String path,filename;	
			filename="FileDemo.txt";
			 String current = new java.io.File( "." ).getCanonicalPath();
			 path=current+"/src/"+filename;

			 File file = new File(path);
			 System.out.println(file.length());
			 int n,i=0,j;
			 n=(int)file.length();
		
		FileReader fr = new FileReader(path);
		char[] c=new char[n];
		String a;
		fr.read(c);
		a=String.copyValueOf(c);
//		System.out.println(a);
//		System.out.println(a.length());
		fr.close();	
		
		int flag=0;
		String[] s=a.split(" ");
		String[] w=new String[n];
		int e[]=new int[n];
		
		for(String x:s) {
			
			for(j=0;j<i;j++) {
				System.out.println(w[j]+" "+x);
               if(w[j]==x) { 
            	   System.out.println("heyyy");
            	   e[j]++;
            	   flag=1;
            	   break;
               }
			}
			if(flag==1) {
				flag=0;
				continue;
			}
				
    //	System.out.println(x);
			w[i]=x;
			if(w[i]==x)
			
			i++;
		}
		
		
		for(j=0;j<i;j++) {
			System.out.println(w[j]+" "+e[j]);
		}
		
	}

}
