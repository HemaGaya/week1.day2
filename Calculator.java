package week1.day2;

public class Calculator {
	public static void main(String[]args) {
		Calculator HS= new Calculator();
		HS.MyCalculator();
		int Add=HS.add(3,4,5);
		System.out.println(Add);
		int Sub=HS.sub(4,5);
		System.out.println(Sub);
		double Mul=HS.mul(10,10);
		System.out.println(Mul);
		float Div=HS.div(55,55);
		System.out.println(Div);
	}
	public void MyCalculator() {
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public double mul(double a, double b) {
		return a*b;
	}
	public float div(float a, float b) {
		return a/b;
	}
}