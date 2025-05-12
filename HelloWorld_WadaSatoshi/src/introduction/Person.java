package introduction;

public class Person {
    String name;
    int age;
    double height;
    double weight;

    static int count = 0;

    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        count++;
    }

    public double bmi() {
        return this.weight / (this.height * this.height);
    }

    public void print() {
        System.out.println("名前は" + this.name + "です");
        System.out.println("年は" + this.age + "才です");
        System.out.println(String.format("BMIは%.1fです\n", this.bmi()));
    }

    public static int getCount() {
        return count;
    }
}

