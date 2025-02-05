package com.bridgelabz.strings.leveltwo;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static String getComputerChoice() {
        Random random = new Random();
        int choice = random.nextInt(3);
        if (choice == 0) {
            return "Rock";
        } else if (choice == 1) {
            return "Paper";
        } else {
            return "Scissors";
        }
    }

    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "It's a tie!";
        } else if (userChoice.equals("Rock") && computerChoice.equals("Scissors") ||
                userChoice.equals("Paper") && computerChoice.equals("Rock") ||
                userChoice.equals("Scissors") && computerChoice.equals("Paper")) {
            return "User wins!";
        } else {
            return "Computer wins!";
        }
    }

    public static double[][] calculateStats(int userWins, int computerWins, int totalGames) {
        double[][] stats = new double[2][2];
        stats[0][0] = userWins;
        stats[0][1] = (userWins / (double) totalGames) * 100;
        stats[1][0] = computerWins;
        stats[1][1] = (computerWins / (double) totalGames) * 100;
        return stats;
    }

    public static void displayResults(int totalGames, int userWins, int computerWins, double[][] stats) {
        System.out.println("Total Games Played: " + totalGames);
        System.out.println("User Wins: " + userWins + " (" + stats[0][1] + "%)");
        System.out.println("Computer Wins: " + computerWins + " (" + stats[1][1] + "%)");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of games to play: ");
        int totalGames = scanner.nextInt();
        scanner.nextLine();
        int userWins = 0;
        int computerWins = 0;

        for (int i = 0; i < totalGames; i++) {
            System.out.print("Enter your choice (Rock/Paper/Scissors): ");
            String userChoice = scanner.nextLine();
            String computerChoice = getComputerChoice();
            System.out.println("Computer chose: " + computerChoice);
            String result = determineWinner(userChoice, computerChoice);
            System.out.println(result);

            if (result.equals("User wins!")) {
                userWins++;
            } else if (result.equals("Computer wins!")) {
                computerWins++;
            }
        }

        double[][] stats = calculateStats(userWins, computerWins, totalGames);
        displayResults(totalGames, userWins, computerWins, stats);
    }
}
