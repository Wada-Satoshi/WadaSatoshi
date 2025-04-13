package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//1-3
		byte byte1 = 10;
		short short1 = 100;
		int int1 = 1000;
		long long1 = 10000;
		float float1 = 9.5f;
		double double1 = 10.5;
		char char1 = 'a';
		String string1 = "ハロー";
		boolean boolean1 = true;

		
		//4
		System.out.println(byte1 + short1 + int1 + long1);
		System.out.println(float1 + double1);
		System.out.println(char1 + " " + string1 + "" +boolean1);
		System.out.println(byte1 + short1 + int1 + long1 + float1 + double1);
		System.out.println(byte1 * short1 * int1 * long1); 
		System.out.println(double1 / short1);
		System.out.println(byte1 - short1);
		System.out.println();
		
		
		//5
		int num1=23,num=20;
		System.out.println("ハローJAVA"+(num+num1));
		System.out.println();
		
		
		//6-9
		String name = "鈴木一郎";
        int age = 24;
        double height = 168.5,weight = 64.2;
        String food = "	オムライス";
        
        //9
        age += 24;
        height += 168.5;
        weight += 64.2;
        
        //7
        double mete = height / 100,bmi = weight / (mete * mete);
             
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + food + "です");
		System.out.printf("BMIは%.2fです",bmi);
		System.out.println("");
		System.out.println("");
		
		//10
		System.out.println(age >= 25 ? "true" : "false");
		System.out.println("");
		//11
		String all = "年齢:" + age + "・身長:" + height + "・体重:" +weight;
		System.out.println(all);
		System.out.println("");
		//12
		int heightInt =(int) height;
		System.out.println("年齢:" + age + "・身長:" + heightInt);
		System.out.println("");
		//13
		System.out.println(age >= 25 || heightInt >= 160 );
		
	}

}
