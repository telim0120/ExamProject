import java.util.ArrayList;

public class GameMaster {
    public static void main(String[] args) {

        ArrayList<Character> party = new ArrayList<>();
        Hero hero = new Hero("勇者", 100, "剣");
        party.add(hero);
        party.add(new Wizard("魔法使い", 60, 20));
        party.add(new Thief("盗賊", 70));

        ArrayList<Monster> monsters = new ArrayList<>();
        monsters.add(new Matango(45, 'A'));
        monsters.add(new Goblin(50, 'A'));
        monsters.add(new Slime(40, 'A'));

        System.out.println("--- 味方パーティ ---");
        for (Character character : party) {
            character.showStatus();
        }
        System.out.println("\n--- 敵グループ ---");
        for (Monster monster : monsters) {
            monster.showStatus();
        }
        System.out.println("");

        System.out.println("味方の総攻撃！");
        for (Character character : party) {
            for (Monster monster : monsters) {
                if (character.isAlive() && monster.isAlive()) {
                    character.attack(monster);
                }
            }
        }
        System.out.println("");

        System.out.println("敵の総攻撃！");
        for (Monster monster : monsters) {
            for (Character character : party) {
                if (monster.isAlive() && character.isAlive()) {
                    monster.attack(character);
                }
            }
        }
        System.out.println("");

        System.out.println("ダメージを受けた勇者が突然光だした！");
        System.out.println("勇者はスーパーヒーローに進化した！\n");

        int heroIndex = party.indexOf(hero);
        if (heroIndex != -1) {
            SuperHero superHero = new SuperHero((Hero) party.get(heroIndex));
            party.set(heroIndex, superHero);

            for (Monster monster : monsters) {
                if (superHero.isAlive() && monster.isAlive()) {
                    superHero.attack(monster);
                }
            }
        }
        System.out.println("");

        System.out.println("--- 味方パーティ最終ステータス ---");
        for (Character character : party) {
            character.showStatus();
            System.out.println("生存状況：" + (character.isAlive() ? "生存" : "戦闘不能"));
        }
        System.out.println("\n--- 敵グループ最終ステータス ---");
        for (Monster monster : monsters) {
            monster.showStatus();
            System.out.println("生存状況：" + (monster.isAlive() ? "生存" : "討伐済み"));
        }
    }
}