package game;

import java.io.Serializable;

public class GameState implements Serializable {

    private Player player;
    private Inventory inventory;
    private EnemyTree enemyTree;

    public GameState(Player player, Inventory inventory, EnemyTree enemyTree) {
        this.player = player;
        this.inventory = inventory;
        this.enemyTree = enemyTree;
    }

    //Getter (Setter optional)

    public Player getPlayer() {
        return player;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }
    public Inventory getInventory() {
        return inventory;
    }
    public EnemyTree getEnemyTree() {
        return enemyTree;
    }

}
