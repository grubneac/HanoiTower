package game;

import java.util.Stack;

import static game.RunApplication.QUANTITY;

public class Tower {
    private final Stack<Integer> tower = new Stack<>();

    public void fillUp() {
        for (int i = QUANTITY; i > 0; i--) {
            tower.push(i*2);
        }
    }
    public Integer[] getTower(){
        return tower.toArray(new Integer[0]);
    }

    public Integer get() {
        return tower.pop();
    }
    
    public void put(Integer disk){
        tower.push(disk);
    }
}
