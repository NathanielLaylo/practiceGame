package com.practiceGame;
import com.practiceGame.Character;
import com.practiceGame.Monster;
import com.practiceGame.monsterManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Character character = new Character();
        character.playerName = "Matiyo";
        System.out.println(character.playerName);
        boolean playingStatus = true;
        Scanner scanner = new Scanner(System.in);

        //create monster list
        monsterManager.createMonster();

        while(playingStatus){
            System.out.println("Type \"fight\" to battle monsters!\n" +
                    "     \"quit\" to exit the game!\n" +
                    "     \"inspect\" to check character info!");
            String userInput = scanner.nextLine().toLowerCase();

            switch (userInput){
                case "fight":
                    character.fightMonster(goblin);
                    break;
                case "inspect":
                    character.playerInfo();
                    System.out.println("Do you want to allocate your stat points?");
                    String inspectInput = scanner.nextLine().toLowerCase();
                    if(inspectInput.equals("yes")){
                        System.out.println("Type \"attack\" if you want to put stat points on your attack power" +
                                "\nType \"defence\" if you want to put stat points on your defence power");
                        String statChoice = scanner.nextLine().toLowerCase();
                        switch (statChoice){
                            case "attack":
                                character.increaseAttack();
                                break;
                            case "defence":
                                character.increaseDefence();
                                break;
                            default:
                                System.out.println("Input not within the choices");
                        }
                    }
                    break;
                case "quit":
                    playingStatus = false;
                    break;
                default:
                    System.out.println("Input not within the choices");

            }

        }
    }
}