//Static keyword check

class Student{
	int count1=0;
	static int count2=0;

	Student(){
			count1++;
			count2++;
		}

	void TotalStudent(){
			System.out.println("Total Student: "+count1);
			System.out.println("Total Student: "+count2);
		}
}

public class StaticTest{
	public static void main(String[] args){

			Student student1=new Student();
			student1.TotalStudent();

			Student student2=new Student();
			student2.TotalStudent();

			Student student3=new Student();
			student3.TotalStudent();

			System.out.println("Check= "+Student.count2);
		}
}