public abstract class Character implements Creature {
    private String name;
    private int hp;

    public Character(String name, int hp) {
        if (hp < 0) {
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }
        this.name = name;
        this.hp = hp;
    }

    @Override
    public final boolean isAlive() {
        return this.getHp() > 0;
    }

    @Override
    public void showStatus() {
        System.out.println(this.getName() + "：HP " + this.getHp());
    }

    // attackメソッドはサブクラスで実装するため、ここでは再宣言しない

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getHp() {
        return this.hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }
}