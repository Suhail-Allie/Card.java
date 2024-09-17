package org.example;

    public class PlayCardGames {
        public static void main(String[] args) {
            // Instantiate one Poker and one Bridge game
            Poker pokerGame = new Poker();
            Bridge bridgeGame = new Bridge();

            // Display descriptions of each game
            System.out.println("Poker Game:");
            pokerGame.displayDescription();
            System.out.println();

            System.out.println("Bridge Game:");
            bridgeGame.displayDescription();
            System.out.println();

            // Deal cards in each game and display them
            System.out.println("Dealing cards in Poker:");
            pokerGame.deal();
            System.out.println();

            System.out.println("Dealing cards in Bridge:");
            bridgeGame.deal();
        }
    }


