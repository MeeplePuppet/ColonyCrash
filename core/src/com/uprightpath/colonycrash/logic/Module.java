package com.uprightpath.colonycrash.logic;

import com.badlogic.gdx.utils.Array;

/**
 * A module associated with the colony.
 */
public abstract class Module implements Comparable<Module> {
    /**
     * The name.
     */
    private String name;

    /**
     * Whether the module is working.
     */
    private boolean working;

    /**
     * The module priority.
     */
    private int priority;

    /**
     * The required power.
     */
    private int requiredPower;

    /**
     * The start of turn effect.
     */
    private Effect startOfTurnEffect;

    /**
     * The grid locations for the module.
     */
    private Array<GridLocation> gridLocations = new Array<GridLocation>();

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
     * Whether the module is working.
     *
     * @return True if the module is working.
     */
    public boolean isWorking() {
        return working;
    }

    /**
     * Setter for working.
     *
     * @param working If the module is working.
     */
    public void setWorking(boolean working) {
        this.working = working;
    }

    /**
     * Getter for the priority.
     *
     * @return The priority.
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Setter for the priority.
     *
     * @param priority The priority.
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }

    /**
     * Getter for the required power.
     *
     * @return The required power.
     */
    public int getRequiredPower() {
        return requiredPower;
    }

    /**
     * Setter for the required power.
     *
     * @param requiredPower The required power.
     */
    public void setRequiredPower(int requiredPower) {
        this.requiredPower = requiredPower;
    }

    /**
     * Getter for the start of turn effect.
     *
     * @return The start of turn effect.
     */
    public Effect getStartOfTurnEffect() {
        return startOfTurnEffect;
    }

    /**
     * Setter for the start of turn effect.
     *
     * @param startOfTurnEffect The start of turn effect.
     */
    public void setStartOfTurnEffect(Effect startOfTurnEffect) {
        this.startOfTurnEffect = startOfTurnEffect;
    }

    /**
     * Getter for the grid locations.
     *
     * @return The grid locations.
     */
    public Array<GridLocation> getGridLocations() {
        return gridLocations;
    }

    /**
     * Setter for the grid locations.
     *
     * @param gridLocations The grid location.
     */
    public void setGridLocations(Array<GridLocation> gridLocations) {
        this.gridLocations = gridLocations;
    }

    @Override
    public int compareTo(Module o) {
        return priority - o.priority;
    }
}
