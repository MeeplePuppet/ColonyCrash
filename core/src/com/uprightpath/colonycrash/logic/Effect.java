package com.uprightpath.colonycrash.logic;

/**
 * An effect applied within the system; used to perform the events described on the
 * cards available to the player.
 */
public abstract class Effect {
    /**
     * The child effect.
     */
    private Effect childEffect;
    /**
     * Checks whether the effect can be applied.
     *
     * @param colony The colony the effect should be applied on.
     * @return True if it can be applied.
     */
    public boolean canApply(Colony colony) {
        return true;
    }

    /**
     * Applies the effect.
     *
     * @param colony The colony to apply the effect to.
     */
    public void apply(Colony colony) {
        if (childEffect != null)
        {
            childEffect.apply(colony);
        }
        applyImplement(colony);
    }

    /**
     * Specific implementation.
     * @param colony The colony to apply the effect to.
     */
    protected abstract void applyImplement(Colony colony);
}
