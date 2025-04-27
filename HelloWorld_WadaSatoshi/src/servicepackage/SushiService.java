package servicepackage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SushiService {

    String greeting;
    String sushiComment;
    String sushiDescription;
    String currentDateTime;


    public SushiService() {
        this.greeting = "こんにちは！ここは日本です！";
        this.sushiComment = "この寿司はうまい";
        this.sushiDescription = "寿司は和食です";
        this.currentDateTime = getCurrentDateTime(); 
    }


    private String getCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        return now.format(formatter);
    }


    public void printMessages() {
        System.out.println(this.greeting);
        System.out.println(this.sushiComment);
        System.out.println(this.sushiDescription);
        System.out.println("今の現在日時は" + this.currentDateTime + "です");
    }
}
