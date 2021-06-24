
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] n;
		n = new int [100];
		int count=0;
		boolean prime;
		for(int k=1;k<=n.length;k++)
			System.out.print(k+"\n");
		for(int i=2;i<=n.length;i++)
		{
		 prime=true;
			for(int j=2;j<=i/2;j++)
			{
				if( i%j == 0) {
					prime=false;			
					break;
				}	
			}
			if(prime == true) {
				count++;			
			}	
		}
		System.out.println("Total prime no :"+count);
			
	}
}
	


