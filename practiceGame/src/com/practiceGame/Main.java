package com.practiceGame;

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
                   // character.fightMonster(goblin);
                    System.out.println("Which area do you want to hunt: 1 or 2?");
                    String userArea = scanner.nextLine().toLowerCase();
                    Monster randomMonster;

                    switch (userArea){
                        case "1":
                            randomMonster = monsterManager.getMonster(1);
                            character.fightMonster(randomMonster);
                            break;
                        case "2":
                            randomMonster = monsterManager.getMonster(2);
                            character.fightMonster(randomMonster);
                            break;
                        default:
                            System.out.println("Input invalid");
                            break;
                    }

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