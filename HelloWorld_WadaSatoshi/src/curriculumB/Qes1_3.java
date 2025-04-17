 package curriculumB;


import java.util.Random;
import java.util.Scanner;


public class Qes1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // 1
        System.out.print("ユーザー名を入力してください: ");
		System.out.println();
		
        String username = scanner.nextLine();


        if (username == null || username.trim().isEmpty()) {
            System.out.println("名前を入力してください");
        } else if (username.length() > 10) {
            System.out.println("名前を10文字以内にしてください");
        } else {
            System.out.println("ユーザー名「" + username + "」を登録しました");
        }


        // 2
        System.out.print("ユーザー名を入力してください: ");
		System.out.println();
        String username2 = scanner.nextLine();


        if (username2 == null || username2.trim().isEmpty()) {
            System.out.println("名前を入力してください");
        } else if (username2.length() > 10) {
            System.out.println("名前を10文字以内にしてください");
        } else if (!username2.matches("^[a-zA-Z0-9]+$")) {
            System.out.println("半角英数字のみで名前を入力してください");
        } else {
            System.out.println("ユーザー名「" + username2 + "」を登録しました");
        }
        
        // 3
        System.out.print("ユーザー名を入力してください: ");
		System.out.println();
        String username3 = scanner.nextLine();


        if (username3 == null || username3.trim().isEmpty()) {
            System.out.println("名前を入力してください");
    		System.out.println();
    		
        } else if (username3.length() > 10) {
            System.out.println("名前を10文字以内にしてください");
        } else if (!username3.matches("^[a-zA-Z0-9]+$")) {
            System.out.println("半角英数字のみで名前を入力してください");
        } else {
            System.out.println("ユーザー名「" + username3 + "」を登録しました");
        }
        // 正常な名前 → ジャンケン開始
        System.out.println("ユーザー名「" + username + "」を登録しました");

        Random rand = new Random();
        int round = 0;

        while (true) {
            System.out.println("\n0:グー 1:チョキ 2:パー から手を選んで番号で入力してください:");
            int playerHand;

            // 入力が数値かどうかを確認
            if (!scanner.hasNextInt()) {
                System.out.println("0〜2の数字を入力してください");
                scanner.next(); // 不正入力を読み飛ばす
                continue;
            }

            playerHand = scanner.nextInt();

            if (playerHand < 0 || playerHand > 2) {
                System.out.println("0〜2の数字を入力してください");
                continue;
            }

            int cpuHand = rand.nextInt(3);
            round++;

            // 表示
            String[] hands = {"グー", "チョキ", "パー"};
            System.out.println("\n" + username + "の手は「" + hands[playerHand] + "」");
            System.out.println("相手の手は「" + hands[cpuHand] + "」");

            // 勝敗判定
            if (playerHand == cpuHand) {
                System.out.println("DRAW あいこ もう一回しましょう！");
                continue;
            }

            boolean isWin = (playerHand == 0 && cpuHand == 1) ||
                            (playerHand == 1 && cpuHand == 2) ||
                            (playerHand == 2 && cpuHand == 0);

            if (isWin) {
                System.out.println("やるやん。\n次は俺にリベンジさせて");
                break;
            } else {
                System.out.println("俺の勝ち！");
                switch (playerHand) {
                    case 0:
                        System.out.println("負けは次につながるチャンスです！\nネバーギブアップ！");
                        break;
                    case 1:
                        System.out.println("たかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ");
                        break;
                    case 2:
                        System.out.println("なんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです");
                        break;
                }
            }
        }

        System.out.println("\n勝つまでにかかった合計回数は" + round + "回です");

        


        scanner.close();
    }
}
