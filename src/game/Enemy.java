package game;

import java.io.Serializable;

public class Enemy implements Comparable<Enemy>, Serializable {

    private int level;

    public void setLevel(int level) {
        this.level = level;
    }
    public int getLevel() {
        return level;
    }

    @Override
    public int compareTo(Enemy other) {
        return Integer.compare(this.level, other.level);
    }

    @Override

    public String toString() {
        return "Enemy(level=" + level + ")";
    }
}
