public class Goblin extends Monster {
    public Goblin(int hp, char suffix) {
        super("ゴブリン", hp, suffix);
    }

    @Override
    public void attack(Creature target) {
        System.out.println(this.getName() + this.getSuffix() + "はナイフで切りつけた！" + target.getName() + "に8のダメージを与えた！");
        target.setHp(target.getHp() - 8);
    }
}