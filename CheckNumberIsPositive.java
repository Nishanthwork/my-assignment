package Week1.day2;

public class CheckNumberIsPositive {
  int Version=10;
 public void positiveCheck() {
	 if (Version > 0) {
		System.out.println(Version  +"is positive"); 
	 }
	 else{
		 System.out.println(Version  +"is negative");
	 }
	 
 }
 public static void main(String[] args) {
	 CheckNumberIsPositive PositiveValue=new CheckNumberIsPositive();
	 CheckNumberIsPositive negativeValue=new CheckNumberIsPositive();
	 PositiveValue.Version=10;
	PositiveValue.positiveCheck();
	negativeValue.Version=9;
	negativeValue.positiveCheck();
	
}
}

