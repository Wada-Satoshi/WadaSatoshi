package curriculumB;

public class Qes5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        // 5
        // 【概要】ループ処理  
        // 【詳細】1*1～9*13まで乗算をする。
        System.out.println("課題5");
        
        for (int i = 1; i <= 9; i++) { 
            for (int j = 1; j <= 20; j++) { 
                System.out.printf("%03d * %03d = %03d", j, i, i * j);
                if (j != 20) {
                    System.out.print(" || ");
                }
            }
            System.out.println(); 
        }


	}

}
