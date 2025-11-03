package se.yrgo.TicTacToe;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player(String playerMarker"X");
        Player player2 = new Player(String playerMarker"O");
        Grid gameBoard = new Grid;
        Scanner scanner = new Scanner(System.in)
        String player1Choice;
        String player2Choice;

        System.out.println("Hej och välkommen till tre i rad!");
        System.out.println("Skriv in spelare 1:s namn");
        player1.setName(scanner.nextLine());
        System.out.println("Skriv in spelare 2:s namn");
        player2.setName(scanner.nextLine());


        System.out.println("Regler: välj en tom ruta genom att skriva en bokstav A-I. Första spelaren som för 3 i rad vinner. För att avsluta, skriv Stopp.");

        gameBoard.printLetters();
        System.out.printf("%n%n");

        while (true)
            System.out.println("Spelare 1: Välj en tom ruta.");
        player1Choice = scanner.nextLine();
            if (player1Choice.toLowerCase() = Stopp){
                break;
            }


}
}
