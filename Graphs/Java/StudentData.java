public class StudentData{
	final int ROLL_NO;
	StudentData(int num){
		ROLL_NO = num;
	}
	void myMethod(){
		System.out.println("Roll no. is : " +ROLL_NO);

	}
	public static void main(String[] args){

		StudentData obj = new StudentData(1234);
		obj.myMethod();
	}
}