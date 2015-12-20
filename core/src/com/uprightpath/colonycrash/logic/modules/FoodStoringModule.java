package com.uprightpath.colonycrash.logic.modules;

/**
 * An interface to define a module that can store food.
 */
public interface FoodStoringModule {

    /**
     * Getter for the max food.
     * @return The max food.
     */
    public int getMaxFood();

    /**
     * Setter for the max food.
     * @param maxFood The max food.
     */
    public void setMaxFood(int maxFood);

    /**
     * The available food.
     *
     * @return The available food.
     */
    public int getAvailableFood();

    /**
     * Adds the indicated food from the module.
     *
     * @param foodToAdd The number of food to add (may be negative.)
     * @return The available food.
     */
    public int addFood(int foodToAdd);
}
