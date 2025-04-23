package basicClass;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Animal {
	
	public static void main(String[] args) {
		  // Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
        Dog dog1 = new Dog();
        System.out.println("動物の名前: " + dog1.name);

        // Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
        Dog dog2 = new Dog(3);
        System.out.println("動物の数: " + dog2.count);

        // 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:m:s");
        String currentTime = sdf.format(now);
        System.out.println("現在の日時: " + currentTime);
    }
}
