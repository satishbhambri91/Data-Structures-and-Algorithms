public class SingleTonClass{
	private static SingleTonClass obj = null;

	private SingleTonClass(){
	//private constructor to make sure that this class can only be instantiated once using its own method and not directly outside.
	}

	private static SingleTonClass ObjectCreationMethod(){

		if(obj == null){
		obj = new SingleTonClass();
		}
		return obj;
	}

	public void Display(){

		System.out.println("SingleTon Class Example");
	}

	public static void main(String[] args){
		SingleTonClass myobj = SingleTonClass.ObjectCreationMethod();
		myobj.Display();

		}
}