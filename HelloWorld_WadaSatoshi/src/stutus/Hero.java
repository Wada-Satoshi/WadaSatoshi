package stutus;


import java.util.Random;

public class Hero extends Character {
    // コンストラクタ
    public Hero(String name) {
        super(name);

        Random rand = new Random();
        setHp(rand.nextInt(1000) + 1);
        setMp(rand.nextInt(1000) + 1);
        setAttack(rand.nextInt(500) + 1);
        setSpeed(rand.nextInt(1000) + 1);
        setDefense(rand.nextInt(100) + 1);
    }
}
