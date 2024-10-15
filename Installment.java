import java.util.Scanner;
class Installment{
	public static void main(String[] args){

		Scanner myobj=new Scanner(System.in);
			int phonePrice=100000;
			int installment;

			System.out.println("Enter the installment : ");
			installment=myobj.nextInt();
			double perMonth=phonePrice/installment;

			System.out.println("Given ammount per month is: "+perMonth);
		}
}