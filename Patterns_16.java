package patterns;

public class Patterns_16 {
	int n=5;
	void f()
	{
		for(int i=1; i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1|| j==1|| i==n/2+1)
				{
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Patterns_16 p1=new Patterns_16();
		p1.f();
	}

}
