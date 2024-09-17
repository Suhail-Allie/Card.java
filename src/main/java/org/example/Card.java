package org.example;

    public class Card {
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


