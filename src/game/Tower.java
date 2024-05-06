package game;

import java.util.Stack;

public class Tower {
    private Stack<Integer> tower = new Stack<>();

    public void fillUp(int quantity) {
        for (int i = 1; i <= quantity; i++) {
            tower.push(i*2);
        }
    }
    public Integer[] getTower(){
        return tower.toArray(new Integer[0]);
    }

}
