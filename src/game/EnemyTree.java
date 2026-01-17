package game;
//This is a Game-Wrapper
import datastructures.BinarySearchTree;
import exceptions.EnemyNotFoundException;

import java.io.Serializable;

public class EnemyTree implements Serializable {

    private final BinarySearchTree<Enemy> tree = new BinarySearchTree<>();

    public void addEnemy(Enemy enemy) {
        tree.insert(enemy);
    }

    public Enemy findEnemy(Enemy enemy) throws EnemyNotFoundException {
       try {
           return tree.find(enemy);
       } catch (EnemyNotFoundException e) {
           throw new EnemyNotFoundException("Gegner mit Level" + enemy.getLevel() + " nicht gefunden!");
       }
    }
    public void printEnemies() {
        tree.printInOrder();
    }


}
