package game;

import java.util.Scanner;

import stutus.Hero;

public class MainGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("名前を入力してください: ");
        String playerName = scanner.nextLine();

        Hero hero = new Hero(playerName);

        System.out.println("こんにちは 「" + hero.getName() + "」さん");
        System.out.println("ステータス");
        System.out.println("HP：" + hero.getHp());
        System.out.println("MP：" + hero.getMp());
        System.out.println("攻撃力：" + hero.getAttack());
        System.out.println("素早さ：" + hero.getSpeed());
        System.out.println("防御力：" + hero.getDefense());
        System.out.println("さあ冒険に出かけよう！");
        
        scanner.close();
    }
}

