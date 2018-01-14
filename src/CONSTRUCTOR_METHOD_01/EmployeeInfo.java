//******************************************************
// EmployeeInfo.java   Author: Nazmul Hasan
// Demonstrates how to use constructor method.
//******************************************************


package CONSTRUCTOR_METHOD_01;

class Employee {
	int  Id, Extension; 
	String Name, Position, Department;  
	float Salary;  
	Employee(){  
		Id = 1405;
		Name = "Andy Alvarado";
		Position = "Recruiter";
		Department = "Human Resource";
		Extension = 7292;
		Salary = 60000;
		System.out.println("Information of Employee 1");
		System.out.println("-------------------------");
		System.out.println("Id is : " +Id);                 
		System.out.println("Name is : " +Name);
		System.out.println("Position is : " +Position);
		System.out.println("Department is : " +Department);
		System.out.println("Extension is : " +Extension);
		System.out.println("Salary is : " +Salary);
		System.out.println();

		Id = 3213;
		Name = "Mary Walsh";
		Position = "Supervisor";
		Department = "Business Office";
		Extension = 7050;
		Salary = 45000;
		System.out.println("Information of Employee 2");
		System.out.println("-------------------------");
		System.out.println("Id is : " +Id);                 
		System.out.println("Name is : " +Name);
		System.out.println("Position is : " +Position);
		System.out.println("Department is : " +Department);
		System.out.println("Extension is : " +Extension);
		System.out.println("Salary is : " +Salary);
		System.out.println();

		Id = 5969;
		Name = "Ellen Hall";
		Position = "Speach Theraphist";
		Department = "Theraphy";
		Extension = 7406;
		Salary = 40000;
		System.out.println("Information of Employee 3");
		System.out.println("-------------------------");
		System.out.println("Id is : " +Id);                 
		System.out.println("Name is : " +Name);
		System.out.println("Position is : " +Position);
		System.out.println("Department is : " +Department);
		System.out.println("Extension is : " +Extension);
		System.out.println("Salary is : " +Salary);
	}
}  

public class EmployeeInfo {

	public static void main(String[] args) {
		Employee E = new Employee();

	}

}
