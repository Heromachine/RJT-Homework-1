package prime;

public class main 
{

	public static void main(String[] args) 
	{
		for (int i = 2; i <= 100; i++)
		{	
			
			//Not very efficient
			//Don't need to test all j from 2 to i
			//Maybe just primes from 2 to sqrt(i)
			
			for(int j = 2; j <= i; j++)
			{
				if(j == i)
				{
					System.out.println(i);
				}
				if(i%j == 0)
				{
					break;
				}
			}
			
		}
	}

}
