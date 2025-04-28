package animal;
public class Animal {

    private String name;
    private double length;
    private int speed;


    public void setName(String name) {
        this.name = name;
    }


    public void setLength(double length) {
        this.length = length;
    }


    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public String getName() {
        return this.name;
    }


    public double getLength() {
        return this.length;
    }


    public int getSpeed() {
        return this.speed;
    }


    public void printInfo() {
        System.out.println("動物名：" + this.getName());
        System.out.println("体長：" + this.getLength() + "m");
        System.out.println("速度：" + this.getSpeed() + "km/h");
    }


    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("ライオン");
        lion.setLength(2.1);
        lion.setSpeed(80);


        lion.printInfo();
    }
}

