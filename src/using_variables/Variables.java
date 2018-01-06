//************************************************************
//Variables.java   Author: Nazmul Hasan
// Demonstrate different types of Variables
//************************************************************
package using_variables;

public class Variables {

	public static void main(String[] args) {
			  
			          System.out.println();
			   
			    
			          //Declaration Statements//
			          byte byteVar;
			          boolean boolVar;
			          float fVar1;
			          float fVar2;
			 
			    
			          //Initialize//
			          byteVar = 10;
			          boolVar = true;
			          fVar1 = 6.9f;
			          fVar2 = 9.5f;
			  
			    
			          //String Concatenation-Announcing current values//
			          System.out.println("The current value of byteVar is " + byteVar);
			          System.out.println("The current value of boolVar is " + boolVar);
			          System.out.println("The current value of fVar1 is " + fVar1);
			          System.out.println("The current value of fVAr2 is " + fVar2);
			          System.out.println();
			      
			    
			          //Change Variables//
			          byteVar = 10;
			          boolVar = false;
			          fVar1 = 15.0f;
			          fVar2 = 36.0f;
			          System.out.println();
			         
			          //String Concatenation-Announcing New Values//
			          System.out.println("The current value of byteVar is " + byteVar);
			          System.out.println("The current value of boolVar is " + boolVar);
			          System.out.println("The current value of fVar1 is " + fVar1);
			          System.out.println("The current value of fVAr2 is " + fVar2);
			          System.out.println();  
			       
			    
			          //Swap Float Variables//
			          fVar1 = fVar1 + byteVar;
			          fVar2 = fVar2 - byteVar;
			          System.out.println();
			       
			       
			          //Announce Swapped Variables//
			          System.out.println("The current value of fVar1 is " + fVar1);
			          System.out.println("The current value of fVar2 is " + fVar2);
			         
			       
			      
			       
			  
			  }


	}
