//******************************************************
// AnotherEmployeeInfo.java   Author: Nazmul Hasan
// Demonstrates how to use constructor method.
//******************************************************


package CONSTRUCTOR_METHOD_02;


class Employee {
	int  Id, Extension; 
	String Name, Position, Department;  
	float Salary;
	Employee(int Id, int Extension, String Name, String Position, String Department, float Salary)
	{  
		this.Id = Id;
		this.Extension = Extension;
		this.Name = Name;
		this.Position = Position;
		this.Department = Department;
		this.Salary = Salary;
	}
	void display () {

		System.out.println("Id is : " +Id);                 
		System.out.println("Name is : " +Name);
		System.out.println("Position is : " +Position);
		System.out.println("Department is : " +Department);
		System.out.println("Extension is : " +Extension);
		System.out.println("Salary is : " +Salary);
	}
}



public class AnotherEmployeeInfo {

	public static void main(String args []) {
		System.out.println("I like to see who is the recruiter of the company.");
		System.out.println("--------------------------------------------------");
		Employee E1 = new Employee (1405, 7292, "Andy Alvarado", "Recruiter", "Human Resource", 60000);
		E1.display();

		System.out.println();
		System.out.println("\nI like to see a different employee information who works in business office.");
		System.out.println("-------------------------------------------------------------------------------");
		Employee E2 = new Employee (3213, 7050, "Mary Walsh", "Supervisor", "Business Office", 45000);
		E2.display();
	}

}
