package Patterns_programming;

class A_z_Patterns {
	public static void main(String[] args){ 
		
		
		/*a();
		System.out.println("...............................................");
		b();
		System.out.println("...............................................");
		c();
		System.out.println("...............................................");
		d();
		System.out.println("...............................................");
		e();
		System.out.println("................................................");
		f();
		System.out.println("................................................");
		g();
		System.out.println("................................................");
		h();
		System.out.println(".................................................");
		i();
		System.out.println("..................................................");
		j();
		System.out.println("..................................................");
		k();
		System.out.println("..................................................");
		l();
		System.out.println("..................................................");
		m();
		System.out.println("..................................................");
		n();
		System.out.println("....................................................");
		o();
		System.out.println("...................................................");
		p();
		System.out.println("....................................................");
		q();
		System.out.println("....................................................");
		r();
		System.out.println("....................................................");
		s();
		System.out.println("....................................................");
		t();
		System.out.println(".....................................................");
		u();
		System.out.println("......................................................");
		v();
		System.out.println(".......................................................");
		x();
		System.out.println(".......................................................");
		y();
		System.out.println("..........................................................");
		z();*/
		
		String str="keerthi";
		for(int i=0;i<=str.length();i++){
			char ch= str.charAt(i);
			
			switch(ch)
			{
			case 'a':a();
			System.out.println("==============================");
			break;
			case 'b':b();
			System.out.println("==============================");
			break;
			case 'c':c();
			System.out.println("===============================");
			break;
			case'd':d();
			System.out.println("==============================");
			break;
			case 'e':e();
			System.out.println("===============================");
			break;
			case 'f':f();
			System.out.println("===============================");
			break;
			case 'g':g();
			System.out.println("================================");
			break;
			case 'h':h();
			System.out.println("=================================");
			break;
			case 'i':i();
			System.out.println("=================================");
			break;
			case 'j':j();
			System.out.println("==================================");
			break;
			case 'k':k();
			System.out.println("=====================================");
			break;
			case'l':l();
			System.out.println("======================================");
			break;
			case'm':m();
			System.out.println("======================================");
			break;
			case 'n':n();
			System.out.println("======================================");
			break;
			case'o':o();
			System.out.println("======================================");
			break;
			case 'p':p();
			System.out.println("======================================");
			break;
			case'q':q();
			System.out.println("======================================");
			break;
			case 'r':r();
			System.out.println("======================================");
			break;
			case 's':s();
			System.out.println("======================================");
			break;
			case't':t();
			System.out.println("======================================");
			break;
			case'u':u();
			System.out.println("======================================");
			break;
			case'v':v();
			System.out.println("======================================");
			break;
			case 'z':z();
			System.out.println("======================================");
			break;
			case 'x':x();
			System.out.println("======================================");
			}
		}
		
		
	}
static int n=5;
	
	static void a() 
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n/2+1||j==1||j==5)
				{
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
				
		}
	}
	static void b() 
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1|| i==n/2+1||i==n||j==1||j==5)
				{
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
				
		}
	}
	static void c()
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1|| j==1||i==n)
				{
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
				
		}
	}
	static void d()
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n||i==n/2+1||j==1||j==n)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
				
		}
	}
	static void e() 
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n||j==1||i==n/2+1)
				{
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
				
		}
	}

	static void f()
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||j==1||i==n/2+1)
				{
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
				
		}
	}

	static void g()
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||j==1||i==n||(i>n/2&&j==n)||(i==(n/2+1)&&j>n/2))
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
				
		}
	}

	static void h()
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1||j==n||i==n/2+1)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
				
		}
	}

	static void i()
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n||j==n/2+1)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
				
		}
	}
	static void j()
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||(i==n&&j<=n/2+1)||j==n/2+1)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
				
		}
	}
	static void k()
	{
		int x=n/2+1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1||j==x)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			if(i<=n/2)
			{
				x--;
			}
			else
			{
				x++;
			}
			System.out.println();
				
		}
	}
	static void l()
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1||(i==n&&j<=(n/2)+1))
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
				
		}
	}
	
	static void m()
	{
		int x=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1||j==n||((j==x||j==n-x+1)&&i<=n/2+1))
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			x++;
			System.out.println();
				
		}
	}
	static void n()
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1||j==n||i==j)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
				
		}
	}
	static void o()
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1||j==1||i==1||i==n||j==n)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
				
		}
	}
	static void p()
	{
		int x=(n/2)+1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if((i==1&&j<=x)||j==1||(j==x&&i<=x)||(i==x&&j<=x))
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
				
		}
	}


	static void q()
	{   
		int n=5;
		int x=n-n/2+1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(((i==1||i==x+1)&&j<=x+1)||(j==1||j==x+1)&&i<=x+1)
				{
					System.out.print("*");
				}
				else if (j==i&&i>=x){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
				
		}
	}
	static void r()
	{
		int x=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1||i==1||i==n/2+1||(i<=n/2&&j==n/2+1)||j==x)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				if(i>n/2)
				{
					x++;
				}
			}
			System.out.println();
				
		}
	}




	static void s()
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n||i==n/2+1||(j==1&&i<=n/2+1)||(j==n&&i>n/2+1))
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
				
		}
	}
	static void t()
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||j==n/2+1)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
				
		}
	}


	static void u()
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==5||j==1||j==5)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
				
		}
	}
	static void v()
	{
		int x=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=2*n;j++)
			{
				if(j==x||j==2*n-x)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			x++;	
		}
	}
	static void x()
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==i||j==n-i+1)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
				
		}
	}

	static void y()
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if((j==i||j==n-i+1)&&i<=n/2+1||(j==n/2+1&&i>n/2))
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
				
		}
	}
	static void z()
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n||j==n-i+1)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
				
		}
	}


}
