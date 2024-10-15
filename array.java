//Array Example
import java.util.Scanner;
class array{
		public static void main(String[] args){
			Scanner scanner=new Scanner(System.in);
				int[] arr1;
				arr1=new int[10];

				System.out.println("Enter 10 numbers");
				for(int i=0;i<arr1.length;i++){
						arr1[i]=scanner.nextInt();
					}

				System.out.println("The entered numbers are : ");
				for(int i=0;i<arr1.length;i++){
						System.out.println(arr1[i]);
					}

				//Finding maximum number

				int max=arr1[0];
				for(int i=1;i<arr1.length;i++){
						if(max<arr1[i]){max=arr1[i];}
					}
				System.out.println("Maximum Number is: "+max);

			}
	}