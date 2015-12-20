package com.uprightpath.colonycrash.logic.modules;

/**
 * Interface to indicate a power producing module.
 */
public interface PowerProducingModule {

    /**
     * Getter for the power produced..
     *
     * @return The power produced.
     */
    public int getPowerProduced();

    /**
     * Setter for the power produced.
     * @param powerProduced The power produced.
     */
    public void setPowerProduced(int powerProduced);
}
