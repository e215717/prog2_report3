package jp.ac.uryukyu.ie.e215717;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    /**
     * Warriorクラスからオブジェクトを生成し、attackWithWeponSkillを3回実行し、3回ともattackの150%ダメージになっていることを確認する
     * 検証手順
     *  (1) ウォーリアと敵を準備。ヒーローの攻撃力は敵を3回攻撃すると倒せる状態とする。
     *  (2) ヒーローが殴り、敵も殴る。敵は３回の攻撃で倒されていることを期待。
     *  (3) ３回攻撃を繰り返すとスライムが死ぬ。
     * 　　つまり３回攻撃を攻撃を実行することを期待。これを検証する。
     */
    @Test
    void attackTest() {
        int defaultHeroHp = 100;
        Warrior demoWarrior = new Warrior("デモ戦士", defaultHeroHp, 100);
        Enemy slime = new Enemy("スライムもどき", 450, 10);
        int weponDamege = (int)(demoWarrior.attack * 1.5) ;
        for(int i = 0; i<3; i++){
            demoWarrior.attackWithWeaponSkill(slime);
            int decreaseHP = 450 - slime.getHitPoint() ;
            System.out.println(decreaseHP);
            assertEquals(weponDamege * (i+1), decreaseHP);
        }
    }
}