package car;

public class Person {
	  public static int count = 0;
	  public String firstName;
	  public String lastName;
	  public int age;
	  public double height, weight;

	  public Person(String firstName, String lastName, int age, double height, double weight) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.age = age;
	    this.height = height;
	    this.weight = weight;
	    count++;
	  }

	  public String fullName() {
	    return this.firstName + this.lastName;
	  }

	  public void print() {
	    System.out.println("名前は" + this.fullName() + "です");
	    System.out.println("年は" + this.age + "才です");
	    System.out.println("BMIは" + this.bmi() + "です");
	  }

	  public double bmi() {
	    return this.weight / (this.height * this.height);
	  }

	  public static void printCount() {
	    System.out.println("合計" + count + "人です");
	  }

	  // ✅ 問題6-9: buyメソッド定義（オーバーロード）
	  public void buy(Car car) {
	    car.setOwner(this.fullName());
	    System.out.println(car.getOwner() + "が購入しました");
	  }

	  public void buy(Bicycle bicycle) {
	    bicycle.setOwner(this.fullName());
	    System.out.println(bicycle.getOwner() + "が購入しました");
	  }
	}

