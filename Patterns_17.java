package patterns;

public class Patterns_17 {
	public static void main(String[] args) {
		int n=5;
		{
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n;j++)
						{
					if(j==1||j==2||j==3||j==4||j==5)
					{
						System.out.print("*");
					}
						}
				System.out.println();
			}
		}
	}

}
