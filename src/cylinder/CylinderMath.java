//************************************************************
//CylinderMath.java   Author: Nazmul Hasan
// Find out the cylinder surface area with square centimeters
//************************************************************

package cylinder;

public class CylinderMath {

	public static void main(String[] args) {
		
			         double radius, height, surfaceArea;
			      
			         radius = 50;
			         height = 90;
			         surfaceArea =  ( Math.PI * 2 * Math.pow (radius, 2)) + ( Math.PI * 2 * radius * height);
			      
			         System.out.println("Radius is " + radius + " centimeters.");
			         System.out.println("Height is " + height + " centimeters.");
			         System.out.println("The cylinder's surface area is " + surfaceArea + " square centimeters.");
			      
			       
		
	}

}
