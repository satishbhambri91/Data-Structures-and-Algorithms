interface IEvolution{
	void EvolvedFrom();
}
abstract class Animal implements IEvolution{
	public void AnimalSound(){
		System.out.println("Default Sound");
	};	
}

class Lion extends Animal implements IEvolution{

	public void Display(){
		System.out.println("Method Type 1 with Display Name");
	}

	public int Display(int i){
		System.out.println("Method Type with Display Name"+i);
		return 10;
	}
	public void EvolvedFrom(){
		System.out.println("Animalia Kingdom");
	} 
	@Override
	public void AnimalSound(){
		System.out.println("Roar");
	}
}

class Dog extends Animal implements IEvolution{
	public void superAnimalSound(){
		super.AnimalSound();
	}
	@Override
	public void AnimalSound(){
		System.out.println("Bark");
	}
	public void EvolvedFrom(){
		System.out.println("Animalia Kingdom");
	}

}
public class PolyImplementation{
	public static void main(String[] args){
		Lion lion1 = new Lion();
		lion1.AnimalSound();
		Dog dog1 = new Dog();
		dog1.AnimalSound();
		lion1.Display();
		int k = lion1.Display(10);
		System.out.println("Method Returned" +k);
		Animal obj = new Dog();
		obj.AnimalSound();
		dog1.superAnimalSound();
		lion1.EvolvedFrom();

	}
}

