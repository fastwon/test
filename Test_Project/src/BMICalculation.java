import java.util.Scanner;

public class BMICalculation {
	public static void start() {
		System.out.println("비만도 검사를 시작합니다.");
	}
	
	public static double getHeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("키를 입력해주세요 : ");
		double height = k.nextDouble();
		return height;
	}
	
	public static double getWeight() {
		System.out.print("몸무게를 입력해주세요 : ");
		return new Scanner(System.in).nextDouble();
	}
	
	public static double stdWeight(double height) {
		return (height - 100) * 0.9;
	}
	
	public static double obesity(double weight, double stdW) {
		double obsRate = (weight / stdW) * 100;
		return obsRate;
	}
	
	public static String check(double obsRate) {
		String result = obsRate > 120 ? "비만" : "안비만";
		return result;
	}
	
	public static void printResult(double stdW, double obsRate, String result) {
		System.out.println("당신의 표준체중은 " + stdW + "kg 입니다.");
		System.out.printf("당신의 비만도는 : %.2f%%입니다.\n", obsRate);
		System.out.println("측정결과는 : " + result + " 입니다.");
	}
	
	public static void main(String[] args) {
		start();
		double height = getHeight();
		double weight = getWeight();
		double stdW = stdWeight(height);
		double obsRate = obesity(weight, stdW);
		String result = check(obsRate);	
		printResult(stdW, obsRate, result);
	}
}
