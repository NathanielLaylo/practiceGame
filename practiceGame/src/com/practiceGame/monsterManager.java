package com.practiceGame;
import com.practiceGame.Monster;

import java.util.ArrayList;
import java.util.List;

public class monsterManager {
    List<Monster> area1_Monster = new ArrayList<>();
    List<Monster> area2_Monster = new ArrayList<>();

    public void createMonster(){
        area1_Monster.add(new Monster("Goblin", 50, 1, 1, 10, 2));
        area1_Monster.add(new Monster("Slime", 20, 1, 0, 5, 1));
        area1_Monster.add(new Monster("Wolf", 100, 2, 1, 20, 5));

        area2_Monster.add(new Monster("Hobgoblin", 100, 3, 3, 20, 10));
        area2_Monster.add(new Monster("Metal slime", 80, 3, 0, 10, 8));
        area2_Monster.add(new Monster("Wolf", 200, 5, 5, 30, 20));
    }

    //getter
    public List<Monster> getArea1() {
        return area1_Monster;
    }

    public List<Monster> getArea2() {
        return area2_Monster;
    }

    public
}
