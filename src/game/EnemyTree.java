package game;

import datastructures.TreeNode;

public class EnemyTree {

    private TreeNode root;

    public void insert(Enemy enemy) {

        root = insertRecursive(root, enemy);
    }

    private TreeNode insertRecursive(TreeNode current, Enemy enemy) {

        if(current == null) {
            return new TreeNode(enemy);
        }
        if (enemy.getLevel() < current.data.getLevel()) {
            current.left = insertRecursive(current.left, enemy);
        } else if (enemy.getLevel() > current.data.getLevel()) {
            current.right = insertRecursive(current.right, enemy);
        }

        return current;
    }
}
