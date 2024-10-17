//Implement 2D array with taking input

import java.util.Scanner;
class TwoDArray2{
	public static void main(String[] args){

			Scanner scanner=new Scanner(System.in);

			int row, col;

			System.out.println("Enter the number of row : ");
			row=scanner.nextInt();

			System.out.println("Enter the number of col : ");
			col=scanner.nextInt();

			int[][] arr1=new int[row][col];
			int[][] arr2=new int[row][col];


			System.out.println("Enter the first array : ");

			for(int i=0;i<row;i++)
			{
					for(int j=0;j<col;j++)
					{
							System.out.printf("Arr1[%d][%d]=",i,j);
							arr1[i][j]=scanner.nextInt();
					}
			}

			System.out.println("\n \n");
			System.out.println("The arr1 is : ");

			for(int i=0;i<row;i++)
			{
					for(int j=0;j<col;j++)
					{
							System.out.print("\t"+arr1[i][j]+" ");
					}

					System.out.println();
			}

			//For arr2

			System.out.println("\n \n");
			System.out.println("Enter the second array : ");

						for(int i=0;i<row;i++)
						{
								for(int j=0;j<col;j++)
								{
										System.out.printf("Arr2[%d][%d]=",i,j);
										arr2[i][j]=scanner.nextInt();
								}
						}

						System.out.println("The arr2 is : ");

						for(int i=0;i<row;i++)
						{
								for(int j=0;j<col;j++)
								{
										System.out.print("\t"+arr2[i][j]+" ");
								}

								System.out.println();
			}

		}
}