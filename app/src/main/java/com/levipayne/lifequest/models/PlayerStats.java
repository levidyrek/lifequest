package com.levipayne.lifequest.models;

import java.io.Serializable;

/**
 * Created by Levi on 5/6/2016.
 */
public class PlayerStats implements Serializable {

    public static final int START_MAX_HP = 5;

    public int gold;
    public int level;
    public int xp;
    public int hp;
    public int maxHp;

    public PlayerStats() {}

    public PlayerStats(int gold, int level, int xp, int hp, int maxHp) {
        this.gold = gold;
        this.level = level;
        this.xp = xp;
        this.hp = hp;
        this.maxHp = maxHp;
    }

    /**
     * Calculates what the next xp threshold is to level up for the player based on their level
     * @param level The player's level
     * @return xp required to reach the next level
     */
    public static int getNextXpGoal(int level) {
        int x = level + level - 1;
        return (int) (x * Math.log((double)x) * 10 + 100);
    }

    public int getGold() {
        return gold;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getHp() {
        return hp;
    }

    public int getLevel() {
        return level;
    }

    public int getXp() {
        return xp;
    }
}
