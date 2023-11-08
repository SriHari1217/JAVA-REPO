class Animal{
	void AnimalSound(){
		System.out.println("Animal Sound");

	}	
}
class Lion extends Animal{
	void AnimalSound(){
		System.out.println("Roaring");

	}
	public static void main(String args[]){
		Lion l = new Lion();
		l.AnimalSound();
	}
	
}
class Dog extends Animal{
	void AnimalSound(){
		System.out.println("Barking");
		super.AnimalSound();
		

	}
	public static void main(String args[]){
		Dog d = new Dog();
		d.AnimalSound();
	}
	
}
class Cat extends Animal{
	void AnimalSound(){
		System.out.println("Meowing");

	}
	public static void main(String args[]){
		Cat c = new Cat();
		c.AnimalSound();
	}
	
	
	
}