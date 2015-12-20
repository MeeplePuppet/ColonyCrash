package com.uprightpath.colonycrash.logic;

import com.badlogic.gdx.utils.Array;

/**
 * A card is a unit of action that a player can take.
 */
public abstract class Card {

    /**
     * The name of the card.
     */
    private String name;

    /**
     * The text on the card.
     */
    private String text;

    /**
     * The effect the card produces.
     */
    private Effect effect;

    /**
     * Whether the card is instant (not requiring a whole turn to use.)
     */
    private boolean instant;

    /**
     * Whether the card is discarded after use.
     */
    private boolean discarded;

    /**
     * Getter for the name.
     *
     * @return The name.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for the name.
     *
     * @param name The name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for the text.
     *
     * @return The text.
     */
    public String getText() {
        return text;
    }

    /**
     * Setter for the text.
     *
     * @param text The text.
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Getter for the effect.
     *
     * @return The effect.
     */
    public Effect getEffect() {
        return effect;
    }

    /**
     * Setter for the effect.
     *
     * @param effect The effect.
     */
    public void setEffect(Effect effect) {
        this.effect = effect;
    }

    /**
     * Getter for instant.
     *
     * @return Whether the effect is an instant.
     */
    public boolean isInstant() {
        return instant;
    }

    /**
     * Setter for instant.
     *
     * @param instant Whether the card is an instant.
     */
    public void setInstant(boolean instant) {
        this.instant = instant;
    }

    /**
     * Getter for discard.
     * @return Whether the card is discarded after use.
     */
    public boolean isDiscarded() {
        return discarded;
    }

    /**
     * Setter for discard.
     * @param discarded Whether the card is discarded after use.
     */
    public void setDiscarded(boolean discarded) {
        this.discarded = discarded;
    }
}
