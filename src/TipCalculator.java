import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class TipCalculator {

	public static void main(String[] args) {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMaximumFractionDigits(0);
		
		System.out.println("Welcome to the Tip Calculator App");
		String choice = "Y";
		Scanner sc = new Scanner(System.in);
		while(choice.equalsIgnoreCase("Y"))
		{
		System.out.print("Enter the cost of your meal:  ");
		//to cast as BD
		double meal = sc.nextDouble();
		System.out.println();
		
			for ( double tip = 0.15; tip < .30; tip += 0.05) 
			{
				System.out.println(percent.format(tip));
				BigDecimal TipAmount = new BigDecimal(meal*tip);
				System.out.println("Tip Amount: "+currency.format(TipAmount));
				BigDecimal Total = new BigDecimal(TipAmount.doubleValue()+ meal);
				System.out.println("Total: " + currency.format(Total)+ "\n");
				
				
			}
			while (!choice.equalsIgnoreCase("N")) 
			{
				System.out.print("Coninue? y/n: ");
				choice = sc.next();
				if (choice.equalsIgnoreCase("Y"))break;
			}
		}
		
		sc.close();
		System.out.println("Bye!");

	}

}
