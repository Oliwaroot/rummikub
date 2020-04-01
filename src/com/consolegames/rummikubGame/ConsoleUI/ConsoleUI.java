package com.consolegames.rummikubGame.ConsoleUI;

import com.consolegames.rummikubGame.core.Field;
import com.consolegames.rummikubGame.core.GameState;
import com.consolegames.rummikubGame.core.Player;
import com.consolegames.rummikubGame.core.Tile;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ConsoleUI {

    public void runGame(){
        ConsoleUI ui = new ConsoleUI();
        ui.startGame();
    }

    int counter = 0;

    public void startGame(){
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Rummikub.");
        System.out.print("Enter the number of players: ");
        String val = in.nextLine();

        if(Objects.equals(val, "2")){
            int players = Integer.parseInt(val);
            Field field = new Field();
            field.generateBoard();
            Tile tile = new Tile();
            ArrayList<String> newGameTiles = new ArrayList<>();
            tile.setGameTiles(newGameTiles);
            Player p1 = new Player("Player 1");
            p1.setPlayerHand(newGameTiles);
            Player p2 = new Player("Player 2");
            p2.setPlayerHand(newGameTiles);
            while (field.getState() == GameState.PLAYING){
                counter++;
                Player[] currentPlayer = new Player[]{p1,p2};
                for (int i=0; i<players; i++){
                    currentPlayer[i].playHand(currentPlayer[i].getName(), newGameTiles, field, true, counter);
                    field.generateBoard();
                    if(currentPlayer[i].playerHand.size()==0){
                        field.state = GameState.SOLVED;
                        System.out.println(currentPlayer[i].getName()+" is the winner.");
                        System.out.println();
                        boolean playAgain = false;
                        do{
                            System.out.println("Do you wish to start a new game?");
                            Scanner scanner = new Scanner(System.in);
                            String newVal = scanner.nextLine();
                            if(newVal.equals("Y")){
                                playAgain = true;
                                runGame();
                            }
                            else if (newVal.equals("N")){
                                playAgain = true;
                                System.exit(0);
                            }
                            else {
                                System.out.println();
                                System.out.println("Not a valid entry. Try Again.");
                                System.out.println();
                            }
                        }while (!playAgain);
                    }
                }
            }
        }
        else if(Objects.equals(val, "3")){
            int players = Integer.parseInt(val);
            Field field = new Field();
            field.generateBoard();
            Tile tile = new Tile();
            ArrayList<String> newGameTiles = new ArrayList<>();
            tile.setGameTiles(newGameTiles);
            Player p1 = new Player("Player 1");
            p1.setPlayerHand(newGameTiles);
            Player p2 = new Player("Player 2");
            p2.setPlayerHand(newGameTiles);
            Player p3 = new Player("Player 3");
            p3.setPlayerHand(newGameTiles);
            while (field.getState() == GameState.PLAYING){
                Player[] currentPlayer = new Player[]{p1,p2,p3};
                counter++;
                for (int i=0; i<players; i++){
                    currentPlayer[i].showPlayerHand();
                    currentPlayer[i].playHand(currentPlayer[i].getName(), newGameTiles, field, true, counter);
                    field.generateBoard();
                    if(currentPlayer[i].playerHand.size()==0){
                        field.state = GameState.SOLVED;
                        System.out.println();
                        System.out.println(currentPlayer[i].getName()+" is the winner.");
                        System.out.println();
                        boolean playAgain = false;
                        do{
                            System.out.println("Do you wish to start a new game?");
                            Scanner scanner = new Scanner(System.in);
                            String newVal = scanner.nextLine();
                            if(newVal.equals("Y")){
                                playAgain = true;
                                runGame();
                            }
                            else if (newVal.equals("N")){
                                playAgain = true;
                                System.exit(0);
                            }
                            else {
                                System.out.println();
                                System.out.println("Not a valid entry. Try Again.");
                                System.out.println();
                            }
                        }while (!playAgain);
                    }
                }
            }
        }
        else if(Objects.equals(val, "4")){
            int players = Integer.parseInt(val);
            Field field = new Field();
            field.generateBoard();
            Tile tile = new Tile();
            ArrayList<String> newGameTiles = new ArrayList<>();
            tile.setGameTiles(newGameTiles);
            Player p1 = new Player("Player 1");
            p1.setPlayerHand(newGameTiles);
            Player p2 = new Player("Player 2");
            p2.setPlayerHand(newGameTiles);
            Player p3 = new Player("Player 3");
            p3.setPlayerHand(newGameTiles);
            Player p4 = new Player("Player 4");
            p4.setPlayerHand(newGameTiles);
            while (field.getState() == GameState.PLAYING){
                counter++;
                Player[] currentPlayer = new Player[]{p1,p2,p3,p4};
                for (int i=0; i<players; i++){
                    currentPlayer[i].showPlayerHand();
                    currentPlayer[i].playHand(currentPlayer[i].getName(), newGameTiles, field, true, counter);
                    field.generateBoard();
                    if(currentPlayer[i].playerHand.size()==0){
                        field.state = GameState.SOLVED;
                        System.out.println();
                        boolean playAgain = false;
                        do{
                            System.out.println("Do you wish to start a new game?");
                            Scanner scanner = new Scanner(System.in);
                            String newVal = scanner.nextLine();
                            if(newVal.equals("Y")){
                                playAgain = true;
                                runGame();
                            }
                            else if (newVal.equals("N")){
                                playAgain = true;
                                System.exit(0);
                            }
                            else {
                                System.out.println();
                                System.out.println("Not a valid entry. Try Again.");
                                System.out.println();
                            }
                        }while (!playAgain);
                    }
                }
            }
        }
        else{
            System.out.println("Invalid entry. Players must be between 2 and 4!");
            startGame();
        }
    }

}
