public interface Creature {
    boolean isAlive();
    void showStatus();
    void attack(Creature target);
    String getName();
    int getHp();
    void setHp(int hp);
    // モンスターの枝番（A, Bなど）を取得するメソッド。Characterクラスでは実装しない。
    default char getSuffix() {
        return '\0'; // デフォルト実装（サフィックスなし）
    }
}