package curriculumB;
import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ 
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        

        String[] items = input.split("、");

        for (String item : items) {
            item = item.trim(); 
            int stock = rand.nextInt(12); 

            switch (item) {
                case "テレビ":
                case "ディスプレイ":
                    System.out.println(item + "の残り台数は" + (stock >= 0 ? stock : 0) + "台です\n");
                    break;
                case "パソコン":
                case "冷蔵庫":
                case "扇風機":
                case "洗濯機":
                case "加湿器":
                    System.out.println(item + "の残り台数は" + (stock >= 0 ? stock : 0) + "台です\n");
                    break;
                default:
                    System.out.println("『" + item + "』は指定の商品ではありません。");
                    break;
            }
        }

        scanner.close();
    }
}

