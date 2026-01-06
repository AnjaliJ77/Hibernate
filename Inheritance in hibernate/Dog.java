package Hibernate_Inheritance;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Dog extends Pet{

		int Age;
		String breed;
		public int getAge() {
			return Age;
		}
		public void setAge(int age) {
			Age = age;
		}
		public String getBreed() {
			return breed;
		}
		public void setBreed(String breed) {
			this.breed = breed;
		}
		@Override
		public String toString() {
			return "Dog [Age=" + Age + ", breed=" + breed + "]";
		}
		
		
		
		
		

	

}
