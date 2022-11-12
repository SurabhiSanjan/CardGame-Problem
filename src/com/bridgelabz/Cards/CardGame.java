package com.bridgelabz.Cards;

public class CardGame {
    public static void main(String[] args) {

        DistributeCards distributeCard = new DistributeCards(4, 9);

        distributeCard.distribute();

        distributeCard.printDistributedCards();
    }
}
