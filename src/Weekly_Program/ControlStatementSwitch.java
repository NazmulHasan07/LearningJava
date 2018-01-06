//************************************************************
// ControlStatementSwitch.java   Author: Nazmul Hasan
// Learn how to use Switch Control Statement.
//************************************************************

package Weekly_Program;

public class ControlStatementSwitch {

	public static void main(String[] args) {
		int day=3;
		switch (day)
		{
		case 1:
			System.out.println("Saturday : I have to go to shopping mall at 10:00 am.");
			break;
		case 2:
			System.out.println("Sunday   : I have to go to class at 4:00 pm.");
			break;

		case 3:
			System.out.println("Monday   : I have to go to work at 7:00 am.");


		case 4:
			System.out.println("Tuesday  : I have to go to work at 2:30 pm.");


		case 5:
			System.out.println("Wednesday: I have to go to work at 8:00 am.");


		case 6:
			System.out.println("Thursday : I have to go to work at 2:30 pm.");


		case 7:
			System.out.println("Friday   : I have to go to work at 3:00 pm.");

		}

	}

}