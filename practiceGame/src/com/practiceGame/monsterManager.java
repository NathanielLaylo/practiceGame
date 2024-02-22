package com.practiceGame;
import com.practiceGame.Monster;

import java.util.ArrayList;
import java.util.List;

public class monsterManager {
    public void createMonster(){
        List<Monster> area1Monster = new ArrayList<>();
        area1Monster.add(new Monster("Goblin", 50, 1, 1, 10, 2));
        area1Monster.add(new Monster("Slime", 20, 1, 0, 5, 1));
        area1Monster.add(new Monster("Wolf", 100, 2, 1, 20, 10));
    }
}
