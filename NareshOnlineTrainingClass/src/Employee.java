
public class Employee {

	public static void main(String[] args) {

		int [] n;
		n = new int [100];
		int count;
		for(int j=2;j<=n.length;j++)
			
		{
			count = 0;
			for(int i=1;i<=j;i++)
			{
				if( j%i == 0) {
					
					count++;
				}
				
			}
			if(count==2)
			System.out.print( j+ "\n ");
			
		}
			}
	}
	


