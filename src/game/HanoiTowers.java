package game;

import org.apache.commons.lang3.StringUtils;

import static game.RunApplication.QUANTITY;

public class HanoiTowers {
    private final Tower[] hanoiArr = new Tower[3];
    private static int step;

    void startFillUp() {
        for (int i = 0; i < hanoiArr.length; i++) {
            hanoiArr[i] = new Tower();
        }
        hanoiArr[0].fillUp();
    }

    public void printStatus() {
        int pictureSize = QUANTITY * 2 * hanoiArr.length + 5;
        System.out.println(StringUtils.rightPad("|", pictureSize, '-') + "| STEP: " + step++);
        for (int i = QUANTITY - 1; i >= 0; i--) {
            System.out.print("| ");
            for (int j = 0; j < hanoiArr.length; j++) {
                printLineOfDisks(j, i);
                System.out.print(" ");
            }
            System.out.println("|");
        }
        System.out.println(StringUtils.rightPad("|", pictureSize, '_') + "|");
    }

    private void printLineOfDisks(int tower, int disk) {
        Integer[] currentTower = hanoiArr[tower].getTower();
        Integer diskSize = 0;
        if (currentTower.length > disk) {
            diskSize = currentTower[disk];
        }
        System.out.print(StringUtils.leftPad("", QUANTITY - diskSize / 2, ' '));
        System.out.print(StringUtils.leftPad("", diskSize, 'A'));
        System.out.print(StringUtils.rightPad("", QUANTITY - diskSize / 2, ' '));
    }

    public void moveDisks(int quantity, int from, int to) {
        if (quantity > 0) {
            int inter = 3 - from - to;
            moveDisks(quantity - 1, from, inter);
            moveSingleDisk(from, to);
            moveDisks(quantity - 1, inter, to);
        }
    }

    private void moveSingleDisk(int from, int to) {
        Integer currDisk = hanoiArr[from].get();
        hanoiArr[to].put(currDisk);
        printStatus();
    }
}
