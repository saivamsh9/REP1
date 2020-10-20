
public class Basicsjava1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("I navigated to Home Page");

//HOW TO CALL METHODS FROM one  CLASS TO OTHER CLASS BY USING FOLLOWING METHOD

Methods M=new Methods();
//syntax is mentioned below
//Class object.methodname
M.ValidateHeader();
System.out.print(M.ValidateHeader());
//M is Class object
// Here validateHeader is new method created in other class called Method
//GET VACATION VALIDATOR
Classb b=new Classb();

b.vacationHeader();




 }

}
