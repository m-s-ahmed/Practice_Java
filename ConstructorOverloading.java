//Constructor Overloading

class Teacher{
		String name,gender;
		int phone;

		Teacher(){
				System.out.println("No Information");
			}

		Teacher(String n, String g){
				name=n;
				gender=g;
			}

		Teacher(String n, String g, int p){
				name=n;
				gender=g;
				phone=p;
			}

		void displayInformation(){
				System.out.println("Name: "+name);
				System.out.println("Gender: "+gender);
				System.out.println("Phone: "+phone);
			}
	}


class ConstructorOverloading{
	public static void main(String[] args){

		Teacher teacher1=new Teacher();

		Teacher teacher2=new Teacher("Sajid", "Male");
		teacher2.displayInformation();

		Teacher teacher3=new Teacher("Ahmed Sajid","Male",01303315004);
		teacher3.displayInformation();
	}
}