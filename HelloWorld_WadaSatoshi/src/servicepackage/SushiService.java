package servicepackage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SushiService {
    // フィールドを作成
    String greeting;
    String sushiComment;
    String sushiDescription;
    String currentDateTime;

    // コンストラクタ（thisを使う）
    public SushiService() {
        this.greeting = "こんにちは！ここは日本です！";
        this.sushiComment = "この寿司はうまい";
        this.sushiDescription = "寿司は和食です";
        this.currentDateTime = getCurrentDateTime(); // メソッドで日付取得
    }

    // 現在の日時を取得して返すメソッド
    private String getCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        return now.format(formatter);
    }

    // メッセージを出力するメソッド
    public void printMessages() {
        System.out.println(this.greeting);
        System.out.println(this.sushiComment);
        System.out.println(this.sushiDescription);
        System.out.println("今の現在日時は" + this.currentDateTime + "です");
    }
}
