package JavaPrograms;

public class Factorialprogram {     //create class
	public int factnum(int num) {   // create method name 
		int fact= 1;         
		
		for(int i=1; i<=num;i++) { // for loop
			fact*=i;
		}
		return fact; 
		
	}      //method end
public static void main(String[]args) {
	Factorialprogram obj = new Factorialprogram(); // create object
	int num = 5;                                                       //input
	System.out.println(obj.factnum(num)); //print & call obj
}
}
