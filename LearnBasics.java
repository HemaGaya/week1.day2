package week1.day2;
public class LearnBasics {
	public static void main(String[] args)
	{
	LearnBasics LM = new LearnBasics();
	LM.carName();
	int RegNumber= LM.getCarRegNumber();
	System.out.println(RegNumber);
	String Varient=LM.getCarVarient();
	System.out.println(Varient);
	int Multiply=LM.multiplyTwoNumbers(8,6);
System.out.println(Multiply) 	 ;
	}
	public void carName() {
	System.out.println("baleno");
				}
				public int getCarRegNumber(){
					int CarRegNumber= 9999;
					return CarRegNumber;
				}
			public String getCarVarient() {
				return "petrol";
			}
			public int multiplyTwoNumbers(int a,int b) {
				return a*b;
			}}