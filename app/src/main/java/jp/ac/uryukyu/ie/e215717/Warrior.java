package jp.ac.uryukyu.ie.e215717;

public class Warrior extends LivingThing {

    public Warrior(String name, int maximumHP, int attack){
         super(name, maximumHP, attack);
    }

    public int getHitPoint(){
        return this.hitPoint;
    }
    
    public void attackWithWeaponSkill(LivingThing opponent){
        int damage = (int)(1.5 * attack);
        if (hitPoint >= 0){
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, name, damage);
            opponent.wounded(damage);
        }
        else {
            opponent.wounded(0);
        }   
    
    }
    
}
