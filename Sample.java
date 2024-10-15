class Sample
{
	public static void main(String[] args)
	{
		int x;
		//Begining of inner block
		{
			int y = 100;
			x = 200;
			System.out.println("x = "+x);
		}
		//End of inner block
		System.out.println("x = "+x);
		//y = 200;  //Error as y is not accessible in the outer block
	}
}