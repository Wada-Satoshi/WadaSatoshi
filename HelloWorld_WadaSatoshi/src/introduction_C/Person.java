package introduction_C;

public class Person {
	  public static int count = 0;

	  public String firstName;
	  public String lastName; 
	  public int age;
	  public double height, weight;

	  Person(String firstName, String lastName, int age, double height, double weight) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.age = age;
	    this.height = height;
	    this.weight = weight;
	    Person.count++;
	  }

	  public String fullName() {
	    return this.firstName + this.lastName;
	  }

	  public double bmi() {
	        double bmi = this.weight / (this.height * this.height);
	        double flooredBmi = Math.floor(bmi); 
	        return flooredBmi;
	  }

	  public void print() {
	    System.out.println("名前は" + this.fullName() + "です");
	    System.out.println("年は" + this.age + "才です");
	    System.out.println("BMIは" + this.bmi() + "です");
	    System.out.println();
	  }

	  public static void printCount() {
	    System.out.println("合計" + Person.count + "人です");
	  }
	}

