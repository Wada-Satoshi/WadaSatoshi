package introduction_B;

class Person {
	  
	  public String name;
	  public int age;
	  public double height;
	  public double weight;

	  public static int count = 0;

	  Person(String name, int age, double height, double weight) {
	    this.name = name;
	    this.age = age;
	    this.height = height;
	    this.weight = weight;

	    count++;
	  }
  
	    public double bmi() {
	        double bmi = this.weight / (this.height * this.height);
	        double flooredBmi = Math.floor(bmi); 
	        return flooredBmi;
	  }

	  public void print() {
	    System.out.println("名前は" + this.name + "です");
	    System.out.println("年は" + this.age + "才です");
	    System.out.println("BMIは" + this.bmi() + "です");
	    System.out.println();
	  }

	  public static void printCount() {
	    System.out.println("合計" + count + "人です");
	  }
	}

