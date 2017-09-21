
public class extra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  double x,n=0,y,i,t,d,count=0,e;
//			System.out.print("Enter the number :");
//			x=reader.nextInt();
		    x=Integer.parseInt(str);
//			System.out.println(x);
			y=x;
			e=x;
			for( i=1;i<=x;i=i*10) {
				if(y==i) {
					n++;
					break;
				}
				if(y<i) {
					break;
				}
				n++;	
			}
//			System.out.println(n);
			
			i=i/10;
			for(;n>=0;n--) {
				t=x/i;
				x=x%i;
				i=i/10;
				
				d=y%10;
				y=y/10;
				if(t!=d) {
					System.out.print("not a  pallindrome");
					break;
				}
				
				if(i<=y) {
					System.out.print("is a pallindrome");
					break;
				}
				if(i==0)
					break;
//				System.out.println(d);
			}
			
			while(e!=0) {
				n=e%10;
				if(n%2==0) 
				count=count+n;
				e=e/10;
				
			}
			
//			System.out.println(count);  
			if(count >25)
				System.out.println("and the sum of even numbers is greater than 25");
			else
				System.out.println("and the sum of even numbers is less than 25");
			
			

		}

	}


	}

}
