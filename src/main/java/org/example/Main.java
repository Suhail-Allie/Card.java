package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //Card
    public static class Card {
        // Fields for suit and value
        private String suit;
        private String value;

        // Constructor to initialize suit and value
        public Card(String suit, String value) {
            this.suit = suit;
            this.value = value;
        }

        // Getter for suit
        public String getSuit() {
            return suit;
        }

        // Setter for suit
        public void setSuit(String suit) {
            this.suit = suit;
        }

        // Getter for value
        public String getValue() {
            return value;
        }

        // Setter for value
        public void setValue(String value) {
            this.value = value;
        }

        // toString() method to return a string representation of the card
        @Override
        public String toString() {
            return value + " of " + suit;
        }
    }

    //CardGame
    public abstract static class CardGame {
        // Constants for suits and values
        private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
        private static final String[] VALUES = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        // List to hold the deck of cards
        private List<org.example.Card> deck;

        // Integer field for the number of cards dealt
        protected int cardsDealt;

        // Constructor to initialize the deck of 52 cards
        public CardGame() {
            deck = new ArrayList<>();
            for (String suit : SUITS) {
                for (String value : VALUES) {
                    deck.add(new org.example.Card(suit, value));
                }
            }
            shuffle(); // Shuffle the deck upon initialization
        }

        // Method to shuffle the deck
        public void shuffle() {
            Collections.shuffle(deck);
        }

        // Abstract method to display a brief description of the game
        public abstract void displayDescription();

        // Abstract method to deal cards to one player
        public abstract void deal();

        // Getter for the deck (for use in child classes if needed)
        protected List<org.example.Card> getDeck() {
            return deck;
        }

        // Getter for the number of cards dealt
        public int getCardsDealt() {
            return cardsDealt;
        }

        // Setter for the number of cards dealt
        public void setCardsDealt(int cardsDealt) {
            this.cardsDealt = cardsDealt;
        }
    }

    //Poker
    public static class Poker extends org.example.CardGame {

        // Constructor for Poker
        public Poker() {
            super(); // Call the superclass constructor
            setCardsDealt(5); // Standard poker game deals 5 cards
        }

        @Override
        public void displayDescription() {
            System.out.println("Poker is a popular card game where players aim to have the best hand of 5 cards.");
        }

        @Override
        public void deal() {
            // Deal 5 cards to a player
            System.out.println("Dealing " + getCardsDealt() + " cards to a player.");
            for (int i = 0; i < getCardsDealt(); i++) {
                org.example.Card card = getDeck().remove(0); // Remove card from deck
                System.out.println(card);
            }
        }
    }

    //Bridge
    public class Bridge extends org.example.CardGame {

        // Constructor for Bridge
        public Bridge() {
            super(); // Call the superclass constructor
            setCardsDealt(13); // Standard bridge game deals 13 cards
        }

        @Override
        public void displayDescription() {
            System.out.println("Bridge is a trick-taking game using a standard deck of 52 cards where players are dealt 13 cards each.");
        }

        @Override
        public void deal() {
            // Deal 13 cards to a player
            System.out.println("Dealing " + getCardsDealt() + " cards to a player.");
            for (int i = 0; i < getCardsDealt(); i++) {
                org.example.Card card = getDeck().remove(0); // Remove card from deck
                System.out.println(card);
            }
        }
    }

    //PlayCardGames
    public class PlayCardGames {
        public static void main(String[] args) {
            // Instantiate one Poker and one Bridge game
            org.example.Poker pokerGame = new org.example.Poker();
            org.example.Bridge bridgeGame = new org.example.Bridge();

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


}