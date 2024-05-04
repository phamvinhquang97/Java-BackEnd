package Calculate_BMI_Index;
import java.util.Scanner;  // Import the Scanner class;
import java.lang.Math; // import Math
import java.text.DecimalFormat;
import java.lang.Math; // import Math

public class calculate_bmi_index {

	public static void main(String[] args) {
		/*
		  - tạo variable chứa các chỉ số chiều cao(g), cân nặng(mm)
		  - yêu cầu tính chỉ số BMI (google tìm công thức) chỉ số BMI phải làm tròn đến số thập phân thứ 2 theo công thức sau : 
		  
			1.001 => 1.01
			1.000 => 1.00
			1.009 => 1.01
			
			sau đó dựa vào chỉ số BMI đưa ra lời khuyên sức khỏe 
			béo phì -> kêu người giảm cân
			suy dinh dưỡng -> kêu người ta ăn thêm
			
			RESEARCH : ROUDING a number 
			- dựa vào 1 variable ( value 20 30 40) -> println(message)
		 */
		
		// declare the user's height and weight.
		
		
		System.out.println("------- WELCOME TO BMI Calculator App ----------------");
		float height;
		float weight;
		
		// user input the height and weight
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please input the height (m): ");
		height = scanner.nextFloat();
		System.out.print("Please input the weight (kg): ");
		weight = scanner.nextFloat();
		
		// add the user input the height and weight (use while...loop for user input many time)
		// calculate BMI
		//double calculatedBMI = weight / (height * height);
		//DecimalFormat df = new DecimalFormat("#.###"); // format the BMI take to 3 decimal.
		//float formatBMI = Float.parseFloat(df.format(calculatedBMI)); // convert the string to float
		System.out.println(weight / (height * height));
		
		System.out.println(Math.round(weight / (height * height) * 100));
		float BMI = (Math.round(weight / (height * height) * 100)) / 100; // round the number to 2 decimal (1.001 => 1.01, 1.000 => 1.00, 1.009 => 1.01)
		
		 
		
		System.out.println("Your Body Massive Index (BMI): " + BMI);
		
		
		// give the advise for user.
		
		
			// case 1: Under weight (BMI < 18.5)
			if(BMI < 18.5) {
				System.out.println("Underweight ! Eat More");
			}
			
			// case 2: Normal (18.5 < BMI < 24.9)
			else if(BMI > 18.5 && BMI < 24.9 ){
				System.out.println("Normal ! Keep health diet");
			}
			// case 3: Overweight (25 < BMI < 29.9)
			else if(BMI > 18.5 && BMI < 24.9 ){
				System.out.println("Overweight ! Focus on your diet");
			}
			// case 4: Obese (25 < BMI < 29.9)
			else if(BMI > 18.5 && BMI < 24.9 ){
				System.out.println("Obese ! Go to Doctor please !");
			}
		
			// case 5: Extremly obese (25 < BMI < 29.9)
			else if(BMI > 18.5 && BMI < 24.9 ){
				System.out.println("Extremly obese ! Go to look for partner ! haha");
			} 
			else {
				System.out.println("Error !!! Haha");
			}
	}

}
