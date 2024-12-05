import java.util.Scanner;
public class LabFive {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.println("How many dollars would you like to spend on chocolate from the vending machine? ");
		double NumberofDollars = key.nextDouble();
		
		if(NumberofDollars < 0)
		{
			System.out.println("Invalid value for amount!Exiting the program!");
			System.exit(0);
		}
		
		int NumberofBars = (int) NumberofDollars;
		
		int coupons = NumberofBars;
		
		while( coupons >= 6)
		{
			int additionalChocolateBars = coupons / 6;
			NumberofBars += additionalChocolateBars;
			coupons -= additionalChocolateBars * 6;
			coupons += additionalChocolateBars;
		}
		
		System.out.println("You can buy " + NumberofBars +" chocolate bars and will have 2 coupons left!");
		System.exit(0);
	}

}
