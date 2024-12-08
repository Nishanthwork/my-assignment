package Week1.day2;


public class Browser {
		float Browserversion = 2.0f;
		public void Launchbrowser() {
			System.out.println("Browserlunched is succesfully");
			System.out.println("Chromebrowser version is "+ Browserversion);
		}
		
public void loadUrl() {
	System.out.println("Url Load is successfully");
}
public static void main(String[] args) {
	Browser Chrome=new Browser();
	Browser Edge=new Browser();
	System.out.println("chromebrowser");
	Chrome.Launchbrowser();
	Chrome.loadUrl();
	System.out.println("Edgebrowser");
	Edge.Launchbrowser();
	Edge.loadUrl();
}
}
