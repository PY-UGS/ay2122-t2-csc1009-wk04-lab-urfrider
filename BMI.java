public class BMI {
	private double weight;
	private double height;
	public final static double weight_conversion = 0.45359237;
	public final static double height_conversion = 0.0254;

	
	public BMI(double weight, double height) {
		this.weight = weight * weight_conversion;
		this.height = height * height_conversion;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double calcualteBMI() {
		double BMI = this.weight / Math.pow(this.height, 2);
		return BMI;
	}
	
	public void categoryBMI() {
		double BMI = calcualteBMI();
		if (BMI < 18.5) {
			System.out.println("Underweight");
		}else if (18.5 <= BMI && BMI <25.0) {
			System.out.println("Normal");
		}else if (25.0 <= BMI && BMI <30.0) {
			System.out.println("Overweight");
		}else {
			System.out.println("Obese");
		}
	}
	
}
