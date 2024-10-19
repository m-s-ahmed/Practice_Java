//First Program 101
//Multiple concept added here

class Teacher{
	String name,gender;
	int phone;

	Teacher(String name, String gender, int phone){
			this.name=name;
			this.gender=gender;
			this.phone=phone;
		}

	void displayInformation(){
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("Phone: "+phone);
		}
}

public class Test101{
	public static void main(String[] args){
		//Teacher teacher1=new Teacher();
		//Teacher teacher2=new Teacher();
		Teacher teacher3=new Teacher("S.M.Rafiur Rahman","Male",123456789);

		//1st object
		/*teacher1.name="Md. Sajid Ahmed";
		teacher1.gender="Male";
		int n=teacher1.phone=01303315004;

		System.out.println("Name: "+teacher1.name);
		System.out.println("Gender: "+teacher1.gender);
		System.out.println("Phone: "+n);

		//2nd object
		teacher2.name="Ahmed Sajid";
		teacher2.gender="Male";
		int m=teacher1.phone=01303315004;

		System.out.println("Name: "+teacher2.name);
		System.out.println("Gender: "+teacher2.gender);
		System.out.println("Phone: "+m);*/

		//3rd object
		teacher3.displayInformation();
	}
}