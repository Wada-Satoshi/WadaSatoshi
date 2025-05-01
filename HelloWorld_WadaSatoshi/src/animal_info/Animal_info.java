package animal_info;

import java.util.Scanner;

public class Animal_info {
    

    public static String getScientificName(String name) {
        switch (name) {
            case "ライオン": return "パンテラ レオ";
            case "ゾウ": return "ロキソドンタ・サイクロティス";
            case "パンダ": return "アイルロポダ・メラノレウカ";
            case "チンパンジー": return "パン・トゥログロディテス";
            case "シマウマ": return "チャップマンシマウマ";
            default: return "不明";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("コンソールに文字を入力してください");


        String input = scanner.nextLine();
        String[] animals = input.split(",");

        for (String animalData : animals) {
            String[] parts = animalData.split(":");
            String name = parts[0];
            String length = parts[1];
            String speed = parts[2];

            System.out.println();
            System.out.println("動物名：" + name);
            System.out.println("体長：" + length + "m");
            System.out.println("速度：" + speed + "km/h");
            System.out.println("学名：" + getScientificName(name));
        }

        scanner.close();
    }
}
