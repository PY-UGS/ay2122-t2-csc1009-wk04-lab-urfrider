import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		double weight = sc.nextDouble();
		System.out.print("Enter height in inches: ");
		double height = sc.nextDouble();
		
		BMI person = new BMI(weight, height);
		System.out.println("BMI is " + person.calcualteBMI());
		person.categoryBMI();
		sc.close();
	}
}
