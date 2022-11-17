package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator process = new Calculator();
		int add = process.add(300, 200, 500);
		int sub = process.sub(300, 200);
		double mul = process.mul(300.44, 200.56);
		float div = process.div(22.22f, 11.11f);

		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);

	}

}
