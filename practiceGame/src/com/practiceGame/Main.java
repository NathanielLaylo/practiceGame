package com.practiceGame;
import com.practiceGame.Character;
import com.practiceGame.Monster;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Character matiyo = new Character();
        Monster goblin = new Monster();
<<<<<<< Updated upstream
        matiyo.name = "wow";
        //matiyo.fightMonster(goblin);
        System.out.println(matiyo.name);
=======
        goblin.monsterName = "Goblin";
        character.playerName = "Matiyo";
        System.out.println(character.playerName);
>>>>>>> Stashed changes
        boolean playingStatus = true;
        Scanner scanner = new Scanner(System.in);

        while(playingStatus){
            System.out.println("Type \"fight\" to battle monsters!\n " +
                    "    \"quit\" to exit the game!");
            String userInput = scanner.nextLine().toLowerCase();
            

        }
    }
}