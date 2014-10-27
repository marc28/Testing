import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
	ArrayList<Integer> negNums = new ArrayList<>();
	Scanner scan = new Scanner(System.in);

	int add(String numbers){

		if (numbers.contains(",")) {
			int total = 0; // better inside the if statement
			String[] num = numbers.split(",");
			for (int i = 0; i < num.length; i++) {
				if(Integer.parseInt(num[i]) >= 1000){
					num[i] = "0";
				}
				if (Integer.parseInt(num[i]) < 0) {
					negNums.add(Integer.parseInt(num[i]));
				} else {
					total += Integer.parseInt(num[i]);
				}
			}
			if (negNums.size() > 0) {
				return -1;
			}

			return total;

		}
		
		if(Integer.parseInt(numbers) > 1000)
			return 0;
		else if (numbers.equals(""))
			return 0;
		else if(Integer.parseInt(numbers) < 0)
			return -2;
		else
			return Integer.parseInt(numbers);
	}

	public Calculator()  {
		while(true){
			System.out.print("Enter your number:  ");
			String input = scan.nextLine();
			
			if(add(input)==-1){
				System.out.print("Negative Numbers: ");
				for(Integer i : negNums){
					System.out.print(i + " ");
				}
				negNums = new ArrayList<Integer>();
				System.out.println();
			}else if(add(input) == -2)
				System.out.println("Negative number: " + input);
			else{
				System.out.println("Your answer is: " + add(input));
				System.out.println();
			}
		}
	}

	public static void main(String args[]) {
		new Calculator();
	}

}
