//array assignment
import java.util.Scanner;

class aa2{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
			//String name[];
			//name=new String[7];

			String name[]={"Monday","Tuesday", "Wednesday","Thursday","Friday","Saturday","Sunday" };
			System.out.println("Enter a number which shows your weekend");
			int number=scanner.nextInt();

			for(int i=0;i<name.length;i++){
					if(i==number){
							System.out.println(name[i]);
							//break;
						}
				}


		}
	}