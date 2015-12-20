package com.uprightpath.colonycrash.logic;

import com.badlogic.gdx.utils.Array;
import com.uprightpath.colonycrash.logic.modules.FoodStoringModule;
import com.uprightpath.colonycrash.logic.modules.MaterialStoringModule;
import com.uprightpath.colonycrash.logic.modules.PowerProducingModule;

/**
 * The colony in which the game takes place. It holds all of the Modules, Colonists and other objects.
 */
public class Colony {
    /**
     * The modules attached to the colony.
     */
    private Array<Module> modules = new Array<Module>();

    /**
     * The modules that store food
     */
    private Array<FoodStoringModule> foodStoringModules = new Array<FoodStoringModule>();

    /**
     * The modules that store material.
     */
    private Array<MaterialStoringModule> materialStoringModules = new Array<MaterialStoringModule>();

    /**
     * The modules that produce power.
     */
    private Array<PowerProducingModule> powerProducingModules = new Array<PowerProducingModule>();

    /**
     * The entities in the colony.
     */
    private Array<Entity> entities = new Array<Entity>();

    /**
     * The adjustment to food production.
     */
    private int foodAdjustment;

    /**
     * The adjustment to material production.
     */
    private int materialAdjustment;

    /**
     * The adjustment to power production.
     */
    private int powerAdjustement;

    /**
     * Adds a module to the colony
     *
     * @param module The module.
     */
    public void addModule(Module module) {
        removeModule(module);
        modules.add(module);
        if (module instanceof FoodStoringModule) {
            foodStoringModules.add((FoodStoringModule) module);
        }
        if (module instanceof MaterialStoringModule) {
            materialStoringModules.add((MaterialStoringModule) module);
        }
        if (module instanceof PowerProducingModule) {
            powerProducingModules.add((PowerProducingModule) module);
        }
    }

    /**
     * Removes a module from the colony.
     *
     * @param module The module.
     */
    public void removeModule(Module module) {
        modules.removeValue(module, true);
        if (module instanceof FoodStoringModule) {
            foodStoringModules.removeValue((FoodStoringModule) module, true);
        }
        if (module instanceof MaterialStoringModule) {
            materialStoringModules.removeValue((MaterialStoringModule) module, true);
        }
        if (module instanceof PowerProducingModule) {
            powerProducingModules.removeValue((PowerProducingModule) module, true);
        }
    }

    /**
     * Getter for the entities.
     *
     * @return The entities.
     */
    public Array<Entity> getEntities() {
        return entities;
    }

    /**
     * Setter for the entities.
     *
     * @param entities The entities.
     */
    public void setEntities(Array<Entity> entities) {
        this.entities = entities;
    }

    /**
     * Getter for the food adjustment.
     *
     * @return The food adjustment.
     */
    public int getFoodAdjustment() {
        return foodAdjustment;
    }

    /**
     * Setter for the food adjustment.
     *
     * @param foodAdjustment The food adjustment.
     */
    public void setFoodAdjustment(int foodAdjustment) {
        this.foodAdjustment = foodAdjustment;
    }

    /**
     * Getter for the material adjustment.
     *
     * @return The material adjustment.
     */
    public int getMaterialAdjustment() {
        return materialAdjustment;
    }

    /**
     * Setter for the material adjustment.
     *
     * @param materialAdjustment The material adjustment.
     */
    public void setMaterialAdjustment(int materialAdjustment) {
        this.materialAdjustment = materialAdjustment;
    }

    /**
     * Getter for the power adjustment.
     *
     * @return The power adjustment.
     */
    public int getPowerAdjustement() {
        return powerAdjustement;
    }

    /**
     * Setter for the power adjustment.
     *
     * @param powerAdjustement The power adjustment.
     */
    public void setPowerAdjustement(int powerAdjustement) {
        this.powerAdjustement = powerAdjustement;
    }

    /**
     * Gets the total food stored in all modules.
     *
     * @return The total food available.
     */
    public int getFoodAvailable() {
        int result = 0;
        for (int i = 0; i < foodStoringModules.size; i++) {
            result += foodStoringModules.get(i).getAvailableFood();
        }
        return result;
    }

    /**
     * Adds food to the modules.
     *
     * @param totalFoodToAdd
     */
    public void addFood(int totalFoodToAdd)
    {
        while (totalFoodToAdd > 0)
        {
            for (int i =0; i < foodStoringModules.size; i++)
            {
                foodStoringModules.get(i).addFood(1);
                totalFoodToAdd--;
            }
        }
    }

    /**
     * Uses one food from each of the colony's module until all food needing to
     * be eaten has been used up.
     *
     * @param totalFoodToUse The total to be used.
     * @return The amount of food that still needs to be eaten.
     */
    public int removeFood(int totalFoodToUse) {
        int foodLeft = getFoodAvailable();
        int food;
        while (foodLeft > 0 && totalFoodToUse > 0) {
            foodLeft = 0;
            for (int i = 0; i < foodStoringModules.size; i++) {
                food = foodStoringModules.get(i).addFood(-1);
                if (food >= 0) {
                    totalFoodToUse--;
                    foodLeft += food;
                }
            }
        }
        return totalFoodToUse;
    }


    /**
     * Gets the total material stored in all modules.
     *
     * @return The total material available.
     */
    public int getMaterialAvailable() {
        int result = 0;
        for (int i = 0; i < materialStoringModules.size; i++) {
            result += materialStoringModules.get(i).getAvailableMaterial();
        }
        return result;
    }

    /**
     * Adds materials to the modules.
     *
     * @param materialToAdd
     */
    public void addMaterial(int materialToAdd)
    {
        while (materialToAdd > 0)
        {
            for (int i =0; i < materialStoringModules.size; i++)
            {
                materialStoringModules.get(i).addMaterial(1);
                materialToAdd--;
            }
        }
    }

    /**
     * Uses one material from each of the colony's module until all material needing to
     * be eaten has been used up.
     *
     * @param totalMaterialToUse The total to be used.
     * @return The amount of material that still needs to be used.
     */
    public int removeMaterial(int totalMaterialToUse) {
        int materialLeft = getMaterialAvailable();
        int material;
        while (materialLeft > 0 && totalMaterialToUse > 0) {
            materialLeft = 0;
            for (int i = 0; i < materialStoringModules.size; i++) {
                material = materialStoringModules.get(i).addMaterial(-1);
                if (material >= 0) {
                    totalMaterialToUse--;
                    materialLeft += material;
                }
            }
        }
        return totalMaterialToUse;
    }

    /**
     * Returns the total power available (including the adjustment.)
     *
     * @return The power available.
     */
    public int getPowerProduced()
    {
        int power = 0;
        for (int i = 0; i < powerProducingModules.size; i++)
        {
            power += powerProducingModules.get(i).getPowerProduced();
        }
        return power + powerAdjustement;
    }

    /**
     * Updates the colony.
     */
    public void updateStartOfTurn()
    {
        int eating = 0;
        foodAdjustment = 0;
        materialAdjustment = 0;
        powerAdjustement = 0;

        for (int i = 0; i < modules.size; i++)
        {
            if (modules.get(i).getStartOfTurnEffect().canApply(this))
            {
                modules.get(i).getStartOfTurnEffect().apply(this);
            }
        }
        for (int i = 0; i < entities.size; i++)
        {
            if (entities.get(i).getStartOfTurnEffect().canApply(this))
            {
                entities.get(i).getStartOfTurnEffect().apply(this);
            }
            if (entities.get(i).isEats())
            {
                eating++;
            }
        }

        foodAdjustment -= (eating + 1 / 2);

        if (foodAdjustment > 0) {
            addFood(foodAdjustment);
        } else if (foodAdjustment < 0)
        {
            removeFood(foodAdjustment * - 1);
        }

        if (materialAdjustment > 0)
        {
            addMaterial(materialAdjustment);
        } else if (materialAdjustment < 0) {
            removeFood(materialAdjustment * -1);
        }
    }
}
