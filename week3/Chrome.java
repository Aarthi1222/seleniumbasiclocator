package week3;

public class Chrome extends Browser {
 void openincognite() {
	System.out.println("openincognite");
}
 void clearcache()
{
	System.out.println("clearcache");
	}

public static void main(String[] args)
{
	Chrome bro=new Chrome();
	bro.clearcache();
	bro.openincognite();
	bro.closebrowser();
	bro.navigateback();
	bro.openurl();
}
}