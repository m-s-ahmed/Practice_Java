//All about ArrayList
import java.util.ArrayList;
class ArrayListDemo
{
	public static void main(String[] args)
	{
		ArrayList<Integer>number=new ArrayList<Integer>();
		ArrayList<Integer>number2=new ArrayList<Integer>();
		ArrayList<Integer>number3=new ArrayList<Integer>();

		//Checking the size of the ArrayList at initial stage
		System.out.println("Size= " +number.size());
		System.out.println();

		//Adding element
		number.add(10);
		number.add(20);
		number.add(30);

		//Adding element with index number
		number.add(3,40);
		number.add(4,50);
		number.add(5,60);
		number.add(6,70);
		number.add(7,80);
		number.add(8,90);
		number.add(9,100);

		//Print in easiest way
		System.out.println(number);
		System.out.println();

		System.out.println("Size= "+number.size());
		System.out.println();

		//print with the help of for-each loop
		for(int i:number)
		{
			System.out.println(" "+i);
		}
		System.out.println();

		//Searching an element
		boolean pos=number.contains(50);
		System.out.println(pos);
		System.out.println();

		//Want to know index number
		int a=number.indexOf(50);
		System.out.println(a);
		System.out.println();

		//Remove element at index 9
		number.remove(9);
		System.out.println("After removing= "+number);
		System.out.println();

		//Checking that the ArrayList is empty or not
		boolean b=number.isEmpty();
		System.out.println(b);
		System.out.println();

		//Removing all the element from the ArrayList
		number.removeAll(number);

		//Checking that the ArrayList is empty or not
		boolean c=number.isEmpty();
		System.out.println(c);
		System.out.println();

		//Adding element for number2
		number2.add(101);
		number2.add(102);
		number2.add(103);
		number2.add(104);
		number2.add(105);
		System.out.println(number2);


		//Add all the element from number2 to number3
		number3.addAll(number2);
		System.out.println(number3);
		System.out.println();

		//Checking number2 and number3 are contains same element or not

		boolean result=number3.equals(number2);
		System.out.println(result);
		System.out.println();

		//Set method
		number3.set(0,10);
		System.out.println(number3);

		//Get method
		int g=number3.get(1);
		System.out.println(g);
		System.out.println();

	}
}