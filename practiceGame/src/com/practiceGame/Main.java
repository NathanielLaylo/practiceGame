package com.practiceGame;
import com.practiceGame.Character;
import com.practiceGame.Monster;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Character matiyo = new Character();
        Monster goblin = new Monster();
        matiyo.name = "wow";
        //matiyo.fightMonster(goblin);
        System.out.println(matiyo.name);
        boolean playingStatus = true;
        Scanner scanner = new Scanner(System.in);

        while(playingStatus){
            System.out.println("Type \"fight\" to battle monsters! ");
            String userInput = scanner.nextLine().toLowerCase();
            

        }
    }
}