//******************************************************
// SetGetMethod.java   Author: Nazmul Hasan
// Demonstrates how to use Setter and Getter method.
//******************************************************
package JavaBean;
import java.io.Serializable;

class Employee implements Serializable{
	private static final long serialVersionUID = 1L;
	private int Id;
	private int Extension;
	private String Name, Position, Department ;
	private float Salary;

	public Employee(){
	}


	public void setId(int Id){
		this.Id=Id;
	}


	public int getId(){
		return Id;
	}

	public void setExtension(int Extension){
		this.Extension=Extension;
	}

	public int getExtension(){
		return Extension;
	}

	public void setName(String Name){
		this.Name=Name;
	}

	public String getName(){
		return Name;
	}
	public void setPosition(String Position){
		this.Position=Position;
	}

	public String getPosition(){
		return Position;
	}
	public void setDepartment(String Department){
		this.Department=Department;
	}

	public String getDepartment(){
		return Department;
	}
	public void setSalary(float Salary){
		this.Salary=Salary;
	}

	public float getSalary(){
		return Salary;
	}
}
public class SetGetMethod {

	public static void main(String[] args) {
		Employee e=new Employee();
		System.out.println("-----------------------");
		e.setName("Name: John Diaz");
		e.setPosition("Position: Teacher");
		e.setDepartment("Department: Education");
		System.out.println(e.getName());
		System.out.println(e.getPosition());
		System.out.println(e.getDepartment());
		System.out.println("-----------------------");
		System.out.println();




		System.out.println("-----------------------");
		e.setName("Name: Malcolm Bruse");
		e.setPosition("Position: Story Teller");
		e.setDepartment("Department: TERP");;
		System.out.println(e.getName());
		System.out.println(e.getPosition());
		System.out.println(e.getDepartment());
		System.out.println("-----------------------");
		System.out.println();


		System.out.println("-----------------------");
		e.setName("Name: Erin Laskin");
		e.setPosition("Position: It Help Desk Support Technician");
		e.setDepartment("Department: Information Technology");;
		System.out.println(e.getName());
		System.out.println(e.getPosition());
		System.out.println(e.getDepartment());
		System.out.println("-----------------------");

	}

}
