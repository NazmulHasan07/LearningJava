//******************************************************
// WordsSums.java   Author: Nazmul Hasan
// Demonstrates how to do arguments with variables.
//******************************************************

package Arguments;

public class WordsSums {

	static int sum(int... marks) {
		int total = 0;
		for (int mark : marks) {
			total = total + mark;
		}
		return total;
	}

	static void display(String... values){
		for(String s:values){
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		display();
		display("WELLCOME");
		display("Enjoy","Enjoy the","Enjoy the show","Enjoy the show with", "Enjoy the show with your", "Enjoy the show with your family", "Enjoy the show with your family!");



		System.out.println("Sum of arguments of sum(0) is: " + sum(0));
		System.out.println("Sum of arguments of sum(8) is: " + sum(8));
		System.out.println("Sum of arguments of sum(8, 9) is: " + sum(8, 9));
		System.out.println("Sum of arguments of sum(8, 9, 20) is: " + sum(8, 9, 20));
		System.out.println("Sum of arguments of sum(8, 9, 20, 50) is: " + sum(8, 9, 20, 50));
		System.out.println("Sum of arguments of sum(8, 9, 20, 50, 13) is: " + sum(8, 9, 20, 50, 13));


	}

}
