//************************************************************
// ControlStatementIf.java   Author: Nazmul Hasan
// Learn how to use If Control Statement.
//************************************************************

package Result_Finder_Program;

public class ControlStatementIf {

	public static void main(String[] args) {
		System.out.println("Letter Grade A = Total GPA 4.0.");
		System.out.println("Letter Grade B = Total GPA 3.0.");
		System.out.println("Letter Grade C = Total GPA 2.0.");
		System.out.println("Letter Grade D = Total GPA 1.0.");
		System.out.println("Letter Grade F = Total GPA 0.0.");

		String LetterGrade;
		LetterGrade = "A";


		if (LetterGrade == "A")
		{ 
			System.out.println ("\nFinal Result: In the fall semester 2017, 100 Students has passed based on total marks with total GPA 4.0.");
		}

		if (LetterGrade == "B")
		{ 
			System.out.println ("\nFinal Result: In the fall semester 2017, 80 Students has passed based on total marks with total GPA 3.0.");
		}

		if (LetterGrade == "C")
		{ 
			System.out.println ("\nFinal Result: In the fall semester 2017, 70 Students has passed based on total marks with total GPA 2.0 .");
		}

		if (LetterGrade == "D")
		{ 
			System.out.println ("\nFinal Result: In the fall semester 2017, 50 Students has passed based on total marks with total GPA 1.0.");
		}

		if (LetterGrade == "F")
		{ 
			System.out.println ("\nFinal Result: In the fall semester 2017, 30 Students has failed based on total marks with total GPA 0.0.");
		}


	}

}
