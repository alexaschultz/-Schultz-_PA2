import java.util.Scanner;
public class BMICalculator {
	public static void main(String[] args) 
	{
        Scanner console = new Scanner(System.in);
        System.out.print("height (in feet)? ");
        double feet = console.nextInt();
        System.out.print("height (in inches)? ");
        double height = console.nextDouble();
        height = feet*12 + height;
        System.out.print("weight (in pounds)? ");
        double weight = console.nextDouble();
        double bmi = (weight * 703 / height / height);
        System.out.printf("BMI = %.1f\n",bmi);
        if (bmi < 18.5) 
        {
          System.out.println("underweight");
        }
        else if (bmi < 25){
            System.out.println("normal");
        } 
        else if (bmi < 30){
            System.out.println("overweight");
        }
        else {
            System.out.println("obese");
        }
    }
}
