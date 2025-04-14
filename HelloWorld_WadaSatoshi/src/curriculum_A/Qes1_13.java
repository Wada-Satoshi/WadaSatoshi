package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//1
        // 【概要】宣言処理  
        // 【詳細】変数を宣言する。
		byte byte13;
		short short3;
		int int3;
		long long3;
		float float3;
		double double3;
		char char3;
		String string3;
		boolean boolean3;
		
		
		//2
        // 【概要】初期値代入処理  
        // 【詳細】それぞれの初期値を代入する。
		byte byte2 = 0;
		short short2 = 0;
		int int2 = 0;
		long long2 = 0;
		float float2 = 0.0f;
		double double2 = 0.0;
		char char2 = '\u0000';
		String string2 = "null";
		boolean boolean2 = false;
		
		//3
		
		// 【概要】変数入力処理  
        // 【詳細】ローカル変数の宣言と初期化した後で値の代入する
		// 初期値を設定
		byte byte1 = 10;
		short short1 = 100;
		int int1 = 1000;
		long long1 = 10000;
		float float1 = 9.5f;
		double double1 = 10.5;
		char char1 = 'a';
		String string1 = "ハロー";
		boolean boolean1 = true;

		
		// 4
		// 【概要】計算処理  
        // 【詳細】上記の変数を使いコンソールに表示する。
		System.out.println(byte1 + short1 + int1 + long1);
		System.out.println(float1 + double1);
		System.out.println(char1 + " " + string1 + "" +boolean1);
		System.out.println(byte1 + short1 + int1 + long1 + float1 + double1);
		System.out.println(byte1 * short1 * int1 * long1); 
		System.out.println(double1 / short1);
		System.out.println(byte1 - short1);
		System.out.println();
		
		
		// 5
		 // 【概要】訂正処理  
        // 【詳細】間違っている場所を訂正し正しく表示する。
		int num1=23,num=20;
		System.out.println("ハローJAVA"+(num+num1));
		System.out.println();
		
		
		// 6
		// 【概要】個人情報出力処理  
		// 【詳細】氏名、年齢、身長、体重、好きな食べ物をコンソールに出力する。

		String name = "鈴木一郎";
        int age = 18;
        double height = 170.5,weight = 62.2;
        String food = "	寿司";
        
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + food + "です");
		System.out.println("");
        
        
        // 7
        // 【概要】BMI計算処理  
        // 【詳細】身長と体重を使ってBMIを計算し、小数点以下2桁まで表示する。

        double mete = height / 100,bmi = weight / (mete * mete);
             
		System.out.printf("BMIは%.2fです",bmi);
		System.out.println("");
		System.out.println("");
		
        // 8
        // 【概要】再代入出力処理  
        // 【詳細】変数を再代入して表示する。
		String name2 = "鈴木一郎";
        int age2 = 24,beforeAge = age2;
        double height2 = 168.5,weight2 = 64.2,beforeHeight = height2,beforeWeight = weight2;
        String food2 = "オムライス";
        double mete2 = height2 / 100,bmi2 = weight2 / (mete2 * mete2);
       
        
        System.out.println("初めまして" + name2 + "です");
        System.out.println("年齢は" + age2 + "歳です");
        System.out.println("身長は" + height2 + "cmです");
        System.out.println("体重は" + weight2 + "kgです");
        System.out.println("好きな食べ物は" + food2 + "です");    
		System.out.printf("BMIは%.1fです",bmi2);
		System.out.println("");
		System.out.println("");
		
		
        // 9
        // 【概要】自己代入処理  
        // 【詳細】年齢・身長・体重の各数値に自身の値を加算して更新する。
        age2 += 24;
        height2 += 168.5;
        weight2 += 64.2;
        System.out.println("初めまして" + name2 + "です");
        System.out.println("年齢は" + age2 + "歳です");
        System.out.println("身長は" + height2 + "cmです");
        System.out.println("体重は" + weight2 + "kgです");
        System.out.println("好きな食べ物は" + food2 + "です");    
		System.out.printf("BMIは%.1fです",bmi2);
		System.out.println("");
		System.out.println("");
        
       
		// 10
		// 【概要】条件評価出力処理  
		// 【詳細】年齢が25歳以上であればtrueを出力する。
		System.out.println(beforeAge >= 25 ? "true" : "false");
		System.out.println("");
		
		// 11
		// 【概要】変数の連結出力処理  
		// 【詳細】年齢・身長・体重を文字列型に変換し、1行の文字列として出力する。
		String all = "年齢:" + beforeAge + "・身長:" + beforeHeight + "・体重:" +beforeWeight;
		System.out.println(all);
		System.out.println("");
		
		// 12
		// 【概要】型変換出力処理  
		// 【詳細】年齢・身長の数値を整数型に変換してコンソールに出力する。
		int heightInt =(int) beforeHeight;
		System.out.println("年齢:" + beforeAge + "・身長:" + heightInt);
		System.out.println("");
		
		// 13
		// 【概要】条件評価出力処理  
		// 【詳細】年齢が25歳以上または身長が160cm以上であればtrueを出力する。
		System.out.println(beforeAge >= 25 || heightInt >= 160 );
		
	}

}
