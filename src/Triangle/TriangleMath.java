//************************************************************
//TriangleMath.java   Author: Nazmul Hasan
// Find out the Triangle with square centimeters
//************************************************************

package Triangle;

public class TriangleMath {

	public static void main(String[] args) {
		double sideA, sideB, sideC, s, area;
	      
        sideA = 11.0;
        sideB = 12.0;
        sideC = 13.0;
      
        s = (sideA + sideB + sideC)/2;
      
        area = Math.sqrt(s * (s -sideA) * (s - sideB) * (s - sideC));
      
        System.out.println("Side A is " + sideA + " centimeters.");
        System.out.println("Side B is " + sideB + " centimeters.");
        System.out.println("Side C is " + sideC + " centimeters.");
        System.out.println("The triangle is " + area + " square centimeters.");
	}

}
