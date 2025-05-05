package prefdata_main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import prefdata.Prefecture;
import prefdata.PrefectureData;

public class PrefdataMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("インデックスをカンマ区切りで入力してください（例：8,5,9）：");
        String[] indexInput = scanner.nextLine().split(",");

        System.out.println("昇順 or 降順 を入力してください：");
        String order = scanner.nextLine().trim();

        List<Prefecture> selectedList = new ArrayList<>();


        for (String indexStr : indexInput) {
            int index = Integer.parseInt(indexStr.trim());
            if (index >= 0 && index < PrefectureData.PREFECTURES.length) {
                selectedList.add(PrefectureData.PREFECTURES[index]);
            }
        }

  
        selectedList.sort((a, b) -> {
            if (order.equalsIgnoreCase("降順")) {
                return Double.compare(b.getArea(), a.getArea());
            } else {
                return Double.compare(a.getArea(), b.getArea());
            }
        });


        for (Prefecture p : selectedList) {
            System.out.println("\n都道府県名：" + p.getName());
            System.out.println("県庁所在地：" + p.getCapital());
            System.out.println("面積：" + p.getArea() + "km2");
        }

        scanner.close();
    }
}
