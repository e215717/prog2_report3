package jp.ac.uryukyu.ie.e215717;

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;
    
    LivingThing(String name, int maximumHP, int attack){
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public boolean isDead(){
        return dead;   
    }

    public String getName(){
        return name;    
    }

    public boolean getDead(){
        return this.dead;
    }
    
    public void attack(LivingThing opponent){
        int damage = (int)(Math.random() * attack);
        if (hitPoint >= 0){
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, name, damage);
            opponent.wounded(damage);
        }
        else {
            opponent.wounded(0);
        }
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
