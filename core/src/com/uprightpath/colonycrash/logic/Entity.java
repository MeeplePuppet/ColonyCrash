package com.uprightpath.colonycrash.logic;

/**
 * An entity in the world.
 */
public class Entity {
    /**
     * The type of each entity.
     */
    enum Type {
        PLAYER_OWNED, PLAYER_VISIBLE, PLAYER_INVSIBLE
    }

    /**
     * The name of the entity.
     */
    private String name;

    /**
     * The text for the entity.
     */
    private String text;

    /**
     * The type.
     */
    private Type type;

    /**
     * The cool down for activating this entity.
     */
    private int coolDown;

    /**
     * The remaining cool down for this entity.
     */
    private int remainingCoolDown;

    /**
     * Whether the entity eats.
     */
    private boolean eats;

    /**
     * The effect the entity applies at the start of the turn.
     */
    private Effect startOfTurnEffect;

    /**
     * The effect the entity applies when activated.
     */
    private Effect activatedEffect;

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
     * Getter for the type.
     * @return The type.
     */
    public Type getType() {
        return type;
    }

    /**
     * Setter for the type.
     * @param type The type.
     */
    public void setType(Type type) {
        this.type = type;
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
     * Getter for the cool down.
     *
     * @return The cool down.
     */
    public int getCoolDown() {
        return coolDown;
    }

    /**
     * Setter for the cool down.
     *
     * @param coolDown The cool down.
     */
    public void setCoolDown(int coolDown) {
        this.coolDown = coolDown;
    }

    /**
     * Getter for the remaining cool down.
     *
     * @return The remaining cool down.
     */
    public int getRemainingCoolDown() {
        return remainingCoolDown;
    }

    /**
     * Setter for the remaining cool down.
     *
     * @param remainingCoolDown The remaining cool down.
     */
    public void setRemainingCoolDown(int remainingCoolDown) {
        this.remainingCoolDown = remainingCoolDown;
    }

    /**
     * Getter for eats.
     * @return If the entity eats.
     */
    public boolean isEats() {
        return eats;
    }

    /**
     * Setter for eats.
     * @param eats If the entity eats.
     */
    public void setEats(boolean eats) {
        this.eats = eats;
    }

    /**
     * Getter for the on turn effect.
     *
     * @return The on turn effect.
     */
    public Effect getStartOfTurnEffect() {
        return startOfTurnEffect;
    }

    /**
     * Setter for the on turn effect.
     *
     * @param startOfTurnEffect The on turn effect.
     */
    public void setStartOfTurnEffect(Effect startOfTurnEffect) {
        this.startOfTurnEffect = startOfTurnEffect;
    }

    /**
     * Getter for the activated effect.
     *
     * @return The activated effect.
     */
    public Effect getActivatedEffect() {
        return activatedEffect;
    }

    /**
     * Setter for the activated effect.
     *
     * @param activatedEffect The activated effect.
     */
    public void setActivatedEffect(Effect activatedEffect) {
        this.activatedEffect = activatedEffect;
    }

    /**
     * Updates the cool down for this entity.
     */
    public void updateStartOfTurn()
    {
        this.remainingCoolDown = Math.max(this.remainingCoolDown - 1, 0);
    }
}
