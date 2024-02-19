package com.practiceGame;
import com.practiceGame.Character;
import com.practiceGame.Monster;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Character character = new Character();
        Monster goblin = new Monster();
        goblin.monsterName = "Goblin";
        character.playerName = "Matiyo";
        //character.fightMonster(goblin);
        System.out.println(character.playerName);
        boolean playingStatus = true;
        Scanner scanner = new Scanner(System.in);

        while(playingStatus){
            System.out.println("Type \"fight\" to battle monsters! ");
            String userInput = scanner.nextLine().toLowerCase();

            switch (userInput){
                case "fight":
                    character.fightMonster(goblin);
                    break;
                case "quit":
                    playingStatus = false;
                default:
                    System.out.println("Input not within the choices");

            }

        }
    }
}