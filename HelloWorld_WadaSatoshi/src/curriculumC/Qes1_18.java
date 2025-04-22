package curriculumC;
import java.util.Random;

public class Qes1_18 {
		// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	 public static void printMessage(String str, int num) {
	        System.out.println("Hello " + str + " " + num);
	    }

		
		// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
		    // 2つの整数を受け取って掛け算し、結果を出力するメソッド
	    public static void multiply(int a, int b) {
	        System.out.println(a * b);
	    }


			
		// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	    public static void printArray(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println(arr[i]);
	        }
	    }

		
				
		// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	    public static void multiply(double a, double b) {
	        System.out.println(a + b);
	    }

			
		// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
		// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
		// ※0は出力＆格納しないようにしてください。
	    public static int[] generateRandomArray(int count) {
	        Random rand = new Random();
	        int[] result = new int[count];

	        for (int i = 0; i < count; i++) {
	            int num;
	            do {
	                num = rand.nextInt(100) + 1; // 1～100（0を除く）
	            } while (num == 0);
	            result[i] = num;
	            System.out.println(num); // 順番に出力
	        }

	        return result;
	    }
  

		// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
		// ※小数点以下も表示されるようにしてください。
	    public static double getAverage(int[] numbers) {
	        int sum = 0;
	        for (int n : numbers) {
	            sum += n;
	        }
	        double avg = (double) sum / numbers.length;
	        System.out.println(avg); // 小数点ありで出力
	        return avg;
	    }

		// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	    public static boolean isMoreThan50(double avg) {
	        boolean result = avg >= 50;
	        System.out.println(result);
	        return result;
	    }

		public static void main(String[] args) {
	    // 作成したメソッドをここで呼び出してください
			// Q1
			printMessage("JavaSE", 11); // Q1
    		System.out.println();
    		
    		// Q2
			multiply(3, 4);             
    		System.out.println();
    		
    		// Q3
			int[] array = {1, 2, 3};    
			printArray(array);
    		System.out.println();
    		
    		// Q4
			multiply(2.3, 3.2);        
    		System.out.println();
    		
    		// Q5
			int[] randomArray = generateRandomArray(5); 
    		System.out.println();
    		
    		// Q6
			double average = getAverage(randomArray);   
    		System.out.println();
    		
    		// Q7
			isMoreThan50(average);                      
		}
	}



