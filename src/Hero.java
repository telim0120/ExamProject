public class Hero extends Character {
    private String weapon;

    public Hero(String name, int hp, String weapon) {
        super(name, hp);
        this.weapon = weapon;
    }

    @Override
    public void attack(Creature target) {
        System.out.println(this.getName() + "は" + this.getWeapon() + "で攻撃！" + target.getName() + "に10のダメージを与えた！");
        target.setHp(target.getHp() - 10);
    }

    public String getWeapon() {
        return this.weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}