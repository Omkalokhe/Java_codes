package Mix_all_Type;
// Here we achieve the multilevel inheritance Classes are Animal/PetAnimal/Dog
public class Dog extends PetAnimal{
		@Override
		public void behaviour() {
		System.out.println("Proctetive & Friendlly Nature.");
		}
		public static void main(String[] args) {
			Dog dog=new Dog();
			System.out.println("Dog Details Behaviour: ");
			dog.behaviour();
			dog.legCount=4;
			dog.livingPlace="Land";
			System.out.println("Dogs having "+dog.legCount+" And live on the "+dog.livingPlace+".");
			WildAnimal wildAnimal=new WildAnimal();
			wildAnimal.behaviour();
			
			
		}
}
