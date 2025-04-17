package curriculumB;

public class Qes4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        System.out.println("課題4");
        
        for (int i = 1; i <= 9; i++) { 
            for (int j = 1; j <= 9; j++) { 
                System.out.printf("%02d * %02d = %02d", i, j, i * j);
                if (j != 9) {
                    System.out.print(" || ");
                }
            }
            System.out.println(); 
        }

	}

}
