package game;

public class RunApplication {
    public static final int QUANTITY = 3;

    public static void main(String[] args) {

        HanoiTowers hanoiTowers = new HanoiTowers();
        hanoiTowers.startFillUp(QUANTITY);
        hanoiTowers.printStatus();

        hanoiTowers.move();
    }
}
