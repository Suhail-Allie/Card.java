package org.example;

    public class Poker extends CardGame {

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
                Card card = getDeck().remove(0); // Remove card from deck
                System.out.println(card);
            }
        }
    }


