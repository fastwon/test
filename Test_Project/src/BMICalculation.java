import java.util.Scanner;

public class BMICalculation {
	public static void start() {
		System.out.println("�񸸵� �˻縦 �����մϴ�.");
	}
	
	public static double getHeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("Ű�� �Է����ּ��� : ");
		double height = k.nextDouble();
		return height;
	}
	
	public static double getWeight() {
		System.out.print("�����Ը� �Է����ּ��� : ");
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
		String result = obsRate > 120 ? "��" : "�Ⱥ�";
		return result;
	}
	
	public static void printResult(double stdW, double obsRate, String result) {
		System.out.println("����� ǥ��ü���� " + stdW + "kg �Դϴ�.");
		System.out.printf("����� �񸸵��� : %.2f%%�Դϴ�.\n", obsRate);
		System.out.println("��������� : " + result + " �Դϴ�.");
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
