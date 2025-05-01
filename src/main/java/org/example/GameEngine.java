package org.example;

import org.example.model.Continent;
import org.example.model.Map;
import org.example.state.Phase;
import org.example.state.PreLoad;

import java.util.Arrays;
import java.util.Scanner;

public class GameEngine {
    private Phase gamePhase;
    private Map gameMap;

    public void setGamePhase(Phase gamePhase) {
        this.gamePhase = gamePhase;
//        System.out.println(gamePhase.getClass().getSimpleName());
    }

    public void start() {
        System.out.println("Welcome to Warzone");
        System.out.println();
        this.setGamePhase(new PreLoad(this));
        System.out.print(gamePhase.getClass().getSimpleName() + " $ ");
        Scanner scanner = new Scanner(System.in);
        String[] commandLine = scanner.nextLine().split(" ");
        System.out.println(Arrays.toString(commandLine));

        switch (commandLine[0]) {
            case "editcontinent":
                // editcontinent -add continentID continentValue -remove continentID
                for (int x = 1; x < commandLine.length; ) {
                    switch (commandLine[x]) {
                        case "-add":
                            if (!(commandLine.length - x > 2)){
                                System.out.println("Invalid number of arguments");
                            }
                            String continentID = commandLine[x + 1];
                            int continentValue = Integer.parseInt(commandLine[x + 2]);
                            int id= 1;
                            if(gameMap != null) {
                                id = gameMap.getContinents().size();
                            }
//                            System.out.println("-add " + continentID + " " + " " + continentValue);
                            gameMap.addContinent(new Continent(++id, continentID, continentValue, null));
                            x += 3;
                            break;
                        case "-remove":
                            if (!(commandLine.length - x > 1)){
                                System.out.println("Invalid number of arguments");
                            }
//                            System.out.println("-remove " + commandLine[x + 1]);
                            gameMap.removeContinentByName(commandLine[x+1]);
                            x += 2;
                            break;
                    }

                }
                break;
            case "editcountry":
                System.out.println("editcountry command");
                break;
            case "editneighbor":
                System.out.println("editneighbor command");
                break;
            case "showmap":
                System.out.println("showmap command");
                break;
            case "savemap":
                System.out.println("savemap command");
                break;
            case "editmap":
                System.out.println("editmap command");
                break;
            case "loadmap":
                System.out.println("loadmap command");

                break;
            case "assigncountries":
                System.out.println("assign countries command");
                break;
            case "gameplayer":
                System.out.println("gameplayer command");
                break;
            case "deploy":
                System.out.println("deploy command");
                break;
            case "exit":
                System.out.println("exit command");
                break;
            case "next":
                System.out.println("next command");
                gamePhase.nextStage();
                break;
            default:
                System.out.println("Invalid command");
        }

    }

}
