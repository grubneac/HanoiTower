package game;

import org.apache.commons.lang3.StringUtils;

import static game.RunApplication.QUANTITY;

public class HanoiTowers {
    private Tower[] hanoiArr = new Tower[3];

    void startFillUp(int quantity) {
        for (int i = 0; i < hanoiArr.length; i++) {
            hanoiArr[i] = new Tower();
        }
        hanoiArr[0].fillUp(quantity);
        hanoiArr[1].fillUp(quantity);
        hanoiArr[2].fillUp(quantity);
    }

    public void printStatus() {
        int pictureSize = QUANTITY * 2 * hanoiArr.length + 5;
        System.out.println(StringUtils.rightPad("|", pictureSize, '-') + "|");
        for (int i = 0; i < QUANTITY; i++) {
            System.out.print("| ");
            for (int j = 0; j < hanoiArr.length; j++) {
                printTowerDisk(j, i);
                System.out.print(" ");
            }
            System.out.println("|");
        }
        System.out.println(StringUtils.rightPad("|", pictureSize, '_') + "|");
    }

    private void printTowerDisk(int tower, int disk) {
        Integer[] currentTower = hanoiArr[tower].getTower();
        Integer diskSize = 0;
        if (currentTower.length > disk) {
            diskSize = currentTower[disk];
        }
        System.out.print(StringUtils.leftPad("", QUANTITY - diskSize / 2, ' '));
        System.out.print(StringUtils.leftPad("", diskSize, 'A'));
        System.out.print(StringUtils.rightPad("", QUANTITY - diskSize / 2, ' '));
    }

    public void firstStep() {

    }
}
