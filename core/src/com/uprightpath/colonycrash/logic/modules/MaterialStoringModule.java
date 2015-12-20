package com.uprightpath.colonycrash.logic.modules;

/**
 * An interface to define a module that can store material.
 */
public interface MaterialStoringModule {
    /**
     * Getter for the max material.
     * @return
     */
    public int getMaxMaterial();

    /**
     * Setter for the max material.
     * @param maxMaterial
     */
    public void setMaxMaterial(int maxMaterial);

    /**
     * The available material.
     *
     * @return The available material.
     */
    public int getAvailableMaterial();

    /**
     * Adds the indicated material from the module.
     *
     * @param materialToAdd The number of material to add (may be negative.)
     * @return The available material.
     */
    public int addMaterial(int materialToAdd);
}
