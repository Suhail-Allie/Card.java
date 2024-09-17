package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

    public abstract class CardGame {
        // Constants for suits and values
        private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
        private static final String[] VALUES = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        // List to hold the deck of cards
        private List<Card> deck;

        // Integer field for the number of cards dealt
        protected int cardsDealt;

        // Constructor to initialize the deck of 52 cards
        public CardGame() {
            deck = new ArrayList<>();
            for (String suit : SUITS) {
                for (String value : VALUES) {
                    deck.add(new Card(suit, value));
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
        protected List<Card> getDeck() {
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


