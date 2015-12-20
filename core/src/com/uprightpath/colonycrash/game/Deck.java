package com.uprightpath.colonycrash.game;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.Array;
import com.uprightpath.colonycrash.logic.Card;
import com.uprightpath.colonycrash.logic.Colony;

/**
 * Created by Geo on 12/20/2015.
 */
public class Deck {
    /**
     * The deck (ordered.)
     */
    private Array<Card> deck = new Array<Card>();

    /**
     * The hand (ordered.)
     */
    private Array<Card> hand = new Array<Card>();

    /**
     * The discard pile (unordered.)
     */
    private Array<Card> discard = new Array<Card>();

    /**
     * The maximum hand size.
     */
    private int maxHandSize;

    /**
     * Getter for the deck.
     *
     * @return The deck.
     */
    public Array<Card> getDeck() {
        return deck;
    }

    /**
     * Getter for the hand.
     *
     * @return The hand.
     */
    public Array<Card> getHand() {
        return hand;
    }

    /**
     * Getter for the discard.
     *
     * @return The discard.
     */
    public Array<Card> getDiscard() {
        return discard;
    }

    public void drawCard() {

    }

    /**
     * Plays a card.
     *
     * @param card   The card to play.
     * @param colony The colony to apply it to.
     */
    public void playCard(Card card, Colony colony) {
        card.getEffect().apply(colony);
        hand.removeValue(card, true);
        if (card.isDiscarded()) {
            discard.add(card);
        }
    }


    /**
     * Shuffles the discard into the deck.
     */
    public void reshuffle() {
        discard.addAll(deck);
        deck.removeAll(discard, true);
        while (discard.size > 0) {
            int index = MathUtils.random(discard.size);
            deck.add(discard.get(index));
            discard.removeIndex(index);
        }
    }

    /**
     * Getter for the max hand size.
     *
     * @return The max hand size.
     */
    public int getMaxHandSize() {
        return maxHandSize;
    }

    /**
     * Setter for the max hand size.
     *
     * @param maxHandSize The max hand size.
     */
    public void setMaxHandSize(int maxHandSize) {
        this.maxHandSize = maxHandSize;
    }
}
