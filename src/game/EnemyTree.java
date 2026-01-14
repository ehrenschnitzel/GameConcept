package game;

import datastructures.BinarySearchTree;
import exceptions.EnemyNotFoundException;

public class EnemyTree {

    private final BinarySearchTree<Enemy> tree = new BinarySearchTree<>();

    public void addEnemy(Enemy enemy) {
        tree.insert(enemy);
    }

    public Enemy findEnemy(Enemy enemy) throws EnemyNotFoundException {
        return tree.find(enemy);
    }
    public void printEnemies() {
        tree.printInOrder();
    }


}
