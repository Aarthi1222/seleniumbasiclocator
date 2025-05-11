package week3;

public class Edge extends Chrome {
	 void takesnap()
	{
		System.out.println("takesnapshot");
	}
	
    void clearcache()
    {
    	System.out.println("clearcache");
    	
    }

     public static void main(String[] args) {
    	 Edge obj=new Edge();
    	 obj.clearcache();
    	 obj.takesnap();
    	 obj.closebrowser();
    	 obj.navigateback();
     }
}
