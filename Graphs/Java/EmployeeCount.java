import java.util.* ;
class EmployeeCount{
	private int numOfEmployees = 0;
	public void setter(int n){
		numOfEmployees = n;
	} 
	public int getter(){
		return numOfEmployees;
	}

}
public class EncapsulationExample{
	public static void main(String[] args){
		EmployeeCount obj1 = new EmployeeCount();
		obj1.setter(10);
		int n = obj1.getter();
		System.out.println("The number of Employees are : "+n);
	}
}