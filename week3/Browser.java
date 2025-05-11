package week3;

public class Browser {
	
	int a,b;
	 void openurl()
	{
		
		System.out.println("link");
		
	}
	 void closebrowser()
	{
		
		System.out.println("close");
		
	}
	 void navigateback()
	{
		System.out.println("navigateback");
		
	}

   public static void main(String[] args) {
	Browser cl=new Browser();
	
	cl.openurl();
	cl.closebrowser();
	cl.navigateback();
}
   }