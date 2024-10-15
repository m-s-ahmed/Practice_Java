import java.util.Scanner;
class Voter{
		public static void main(String[] args){
					Scanner myobj=new Scanner(System.in);

					while(true){
					System.out.println("Enter Your Age: ");
					System.out.println("Enter 0 for exit ");
					int age=myobj.nextInt();

					if(age>=18){
							System.out.println("Voter");
							if(age%2==0){System.out.println("Even Vorter");}
							else {System.out.println("Odd Vorter"); }
						}
					else if(age<18) {
							System.out.println("Not a Voter");
						}


				}

			}
	}