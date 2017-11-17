package Animals;

import Animals_03.Cat;
import Animals_03.Dog;

public class Maine {

	public static void main(String[] args) {

		
		Dog dog = new Dog();
		
		Cat cat = new Cat();
		
		cat.setAge(7);
		
		dog.setAge(5);
		System.out.println(cat.getAge());
	}

	
//	public static int returnPetAge(Pet pet){
//		retutn pet.getAge() * 7 ;
//	}
}
