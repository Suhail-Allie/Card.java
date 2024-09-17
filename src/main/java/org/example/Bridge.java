package org.example;

    public class Bridge extends CardGame {

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
                Card card = getDeck().remove(0); // Remove card from deck
                System.out.println(card);
            }
        }
    }


