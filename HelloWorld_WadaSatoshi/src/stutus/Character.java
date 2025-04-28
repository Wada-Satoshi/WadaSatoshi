package stutus;

public class Character {
    private String name;
    private int hp;
    private int mp;
    private int attack;
    private int speed;
    private int defense;


    // コンストラクタ
    public Character(String name) {
        this.name = name;
    }


    // getter
    public String getName() { return this.name; }
    public int getHp() { return this.hp; }
    public int getMp() { return this.mp; }
    public int getAttack() { return this.attack; }
    public int getSpeed() { return this.speed; }
    public int getDefense() { return this.defense; }


    // setter
    public void setHp(int hp) { this.hp = hp; }
    public void setMp(int mp) { this.mp = mp; }
    public void setAttack(int attack) { this.attack = attack; }
    public void setSpeed(int speed) { this.speed = speed; }
    public void setDefense(int defense) { this.defense = defense; }
}
