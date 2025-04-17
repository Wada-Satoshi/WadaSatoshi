package curriculumB;
import java.util.Scanner;
public class Qes7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        // 7
        // 【概要】成績集計処理  
        // 【詳細】生徒それぞれの点数をランダムで決定し、平均を出力する。
		   Scanner scanner = new Scanner(System.in);

		   int studentCount;

	        do {
	            System.out.print("生徒の人数を入力してください（2以上）: ");
	            studentCount = scanner.nextInt();
	        } while (studentCount < 2);

	        int totalEnglish = 0, totalMath = 0, totalScience = 0, totalSocial = 0;

	        double[] studentAverages = new double[studentCount];

	        for (int i = 0; i < studentCount; i++) {
	            System.out.println();

	            System.out.print((i + 1) + "人目の『英語』の点数を入力してください: ");
	            int english = scanner.nextInt();

	            System.out.print((i + 1) + "人目の『数学』の点数を入力してください: ");
	            int math = scanner.nextInt();

	            System.out.print((i + 1) + "人目の『理科』の点数を入力してください: ");
	            int science = scanner.nextInt();

	            System.out.print((i + 1) + "人目の『社会』の点数を入力してください: ");
	            int social = scanner.nextInt();

	            studentAverages[i] = (english + math + science + social) / 4.0;

	            totalEnglish += english;
	            totalMath += math;
	            totalScience += science;
	            totalSocial += social;
	        }

	        System.out.println();


	        for (int i = 0; i < studentCount; i++) {
	            System.out.printf("%d人目の平均点は%.2f点です。\n", (i + 1), studentAverages[i]);
	        }

	        System.out.println();

	        double avgEnglish = totalEnglish / (double) studentCount;
	        double avgMath = totalMath / (double) studentCount;
	        double avgScience = totalScience / (double) studentCount;
	        double avgSocial = totalSocial / (double) studentCount;

	        double overallAverage = (totalEnglish + totalMath + totalScience + totalSocial)
	                / (double) (studentCount * 4);


	        System.out.printf("英語の平均点は%.2f点です。\n", avgEnglish);
	        System.out.printf("数学の平均点は%.2f点です。\n", avgMath);
	        System.out.printf("理科の平均点は%.2f点です。\n", avgScience);
	        System.out.printf("社会の平均点は%.2f点です。\n", avgSocial);
	        System.out.printf("全体の平均点は%.2f点です。\n", overallAverage);

	        scanner.close();
	    }
	}
