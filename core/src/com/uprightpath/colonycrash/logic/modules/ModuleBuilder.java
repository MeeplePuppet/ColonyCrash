package com.uprightpath.colonycrash.logic.modules;

import com.uprightpath.colonycrash.logic.Module;

/**
 * Object for building modules quickly.
 */
public class ModuleBuilder {

    /**
     * Creates a new module based off the provided parameters.
     * @param foodStoring Whether the module should be food storing.
     * @param materialStoring Whether the module should be material storing.
     * @param powerProducing Whether the module should be power producing.
     * @return The module.
     */
    public Module buildBaseModule(boolean foodStoring, boolean materialStoring, boolean powerProducing)
    {
        if (foodStoring && materialStoring && powerProducing)
        {
            return new FMPModule();
        }
        else if (foodStoring && materialStoring)
        {
            return new FMModule();
        }
        else if (foodStoring && powerProducing)
        {
            return new FPModule();
        }
        else if (materialStoring && powerProducing)
        {
            return new MPModule();
        }
        else if (foodStoring)
        {
            return new FMModule();
        }
        else if (materialStoring)
        {
            return new MModule();
        }
        else if (powerProducing)
        {
            return new PModule();
        }
        else {
            return new Module() {
            };
        }
    }

    /**
     * Food, Material and Power producing.
     */
    private class FMPModule extends Module implements FoodStoringModule, MaterialStoringModule, PowerProducingModule {
        /**
         * Food storage.
         */
        FoodStorage foodStorage = new FoodStorage();

        /**
         * Material storage.
         */
        MaterialStorage materialStorage = new MaterialStorage();

        /**
         * Power producing.
         */
        PowerProducing powerProducing = new PowerProducing();

        @Override
        public int getMaxFood() {
            return foodStorage.getMaxFood();
        }

        @Override
        public void setMaxFood(int maxFood) {
            foodStorage.setMaxFood(maxFood);
        }

        @Override
        public int getAvailableFood() {
            return foodStorage.getAvailableFood();
        }

        @Override
        public int addFood(int foodToAdd) {
            return foodStorage.addFood(foodToAdd);
        }

        @Override
        public int getMaxMaterial() {
            return materialStorage.getMaxMaterial();
        }

        @Override
        public void setMaxMaterial(int maxMaterial) {
            materialStorage.setMaxMaterial(maxMaterial);
        }

        @Override
        public int getAvailableMaterial() {
            return materialStorage.getAvailableMaterial();
        }

        @Override
        public int addMaterial(int materialToAdd) {
            return materialStorage.addMaterial(materialToAdd);
        }

        @Override
        public int getPowerProduced() {
            return powerProducing.getPowerProduced();
        }

        @Override
        public void setPowerProduced(int powerProduced) {
            powerProducing.setPowerProduced(powerProduced);
        }
    }

    /**
     * Food and Material module.
     */
    private class FMModule extends  Module implements FoodStoringModule, MaterialStoringModule {
        /**
         * Food storage.
         */
        FoodStorage foodStorage = new FoodStorage();

        /**
         * Material storage.
         */
        MaterialStorage materialStorage = new MaterialStorage();

        @Override
        public int getMaxFood() {
            return foodStorage.getMaxFood();
        }

        @Override
        public void setMaxFood(int maxFood) {
            foodStorage.setMaxFood(maxFood);
        }

        @Override
        public int getAvailableFood() {
            return foodStorage.getAvailableFood();
        }

        @Override
        public int addFood(int foodToAdd) {
            return foodStorage.addFood(foodToAdd);
        }

        @Override
        public int getMaxMaterial() {
            return materialStorage.getMaxMaterial();
        }

        @Override
        public void setMaxMaterial(int maxMaterial) {
            materialStorage.setMaxMaterial(maxMaterial);
        }

        @Override
        public int getAvailableMaterial() {
            return materialStorage.getAvailableMaterial();
        }

        @Override
        public int addMaterial(int materialToAdd) {
            return materialStorage.addMaterial(materialToAdd);
        }
    }

    /**
     * Food and Power producing.
     */
    private class FPModule extends Module implements FoodStoringModule , PowerProducingModule {
        /**
         * Food storage.
         */
        FoodStorage foodStorage = new FoodStorage();

        /**
         * Power producing.
         */
        PowerProducing powerProducing = new PowerProducing();

        @Override
        public int getMaxFood() {
            return foodStorage.getMaxFood();
        }

        @Override
        public void setMaxFood(int maxFood) {
            foodStorage.setMaxFood(maxFood);
        }

        @Override
        public int getAvailableFood() {
            return foodStorage.getAvailableFood();
        }

        @Override
        public int addFood(int foodToAdd) {
            return foodStorage.addFood(foodToAdd);
        }

        @Override
        public int getPowerProduced() {
            return powerProducing.getPowerProduced();
        }

        @Override
        public void setPowerProduced(int powerProduced) {
            powerProducing.setPowerProduced(powerProduced);
        }
    }


    /**
     * Material and Power producing.
     */
    private class MPModule extends Module implements MaterialStoringModule, PowerProducingModule {

        /**
         * Material storage.
         */
        MaterialStorage materialStorage = new MaterialStorage();

        /**
         * Power producing.
         */
        PowerProducing powerProducing = new PowerProducing();

        @Override
        public int getMaxMaterial() {
            return materialStorage.getMaxMaterial();
        }

        @Override
        public void setMaxMaterial(int maxMaterial) {
            materialStorage.setMaxMaterial(maxMaterial);
        }

        @Override
        public int getAvailableMaterial() {
            return materialStorage.getAvailableMaterial();
        }

        @Override
        public int addMaterial(int materialToAdd) {
            return materialStorage.addMaterial(materialToAdd);
        }

        @Override
        public int getPowerProduced() {
            return powerProducing.getPowerProduced();
        }

        @Override
        public void setPowerProduced(int powerProduced) {
            powerProducing.setPowerProduced(powerProduced);
        }
    }

    /**
     * Food producing.
     */
    private class FModule extends Module implements FoodStoringModule {
        /**
         * Food storage.
         */
        FoodStorage foodStorage = new FoodStorage();

        @Override
        public int getMaxFood() {
            return foodStorage.getMaxFood();
        }

        @Override
        public void setMaxFood(int maxFood) {
            foodStorage.setMaxFood(maxFood);
        }

        @Override
        public int getAvailableFood() {
            return foodStorage.getAvailableFood();
        }

        @Override
        public int addFood(int foodToAdd) {
            return foodStorage.addFood(foodToAdd);
        }
    }


    /**
     * Material producing.
     */
    private class MModule extends Module implements MaterialStoringModule {
        /**
         * Material storage.
         */
        MaterialStorage materialStorage = new MaterialStorage();

        @Override
        public int getMaxMaterial() {
            return materialStorage.getMaxMaterial();
        }

        @Override
        public void setMaxMaterial(int maxMaterial) {
            materialStorage.setMaxMaterial(maxMaterial);
        }

        @Override
        public int getAvailableMaterial() {
            return materialStorage.getAvailableMaterial();
        }

        @Override
        public int addMaterial(int materialToAdd) {
            return materialStorage.addMaterial(materialToAdd);
        }
    }

    /**
     * Power producing.
     */
    private class PModule extends Module implements PowerProducingModule {

        /**
         * Power producing.
         */
        PowerProducing powerProducing = new PowerProducing();

        @Override
        public int getPowerProduced() {
            return powerProducing.getPowerProduced();
        }

        @Override
        public void setPowerProduced(int powerProduced) {
            powerProducing.setPowerProduced(powerProduced);
        }
    }

    /**
     * A class for holding the FoodStoringModule's logic.
     */
    private class FoodStorage implements FoodStoringModule {
        /**
         * Available food.
         */
        private int availableFood = 0;

        /**
         * Maximum food.
         */
        private int maxFood;

        @Override
        public int getMaxFood() {
            return maxFood;
        }

        @Override
        public void setMaxFood(int maxFood) {
            this.maxFood = maxFood;
        }

        @Override
        public int getAvailableFood() {
            return availableFood;
        }

        @Override
        public int addFood(int foodToAdd) {
            int temp = availableFood + foodToAdd;
            availableFood = Math.max(temp, 0);
            return temp;
        }
    }

    /**
     * A class for holding the MaterialStoringModule's logic.
     */
    private class MaterialStorage implements MaterialStoringModule {
        /**
         * Available materials.
         */
        private int availableMaterials;

        /**
         * Max materials.
         */
        private int maxMaterials;

        @Override
        public int getMaxMaterial() {
            return maxMaterials;
        }

        @Override
        public void setMaxMaterial(int maxMaterial) {
            this.maxMaterials = maxMaterial;
        }

        @Override
        public int getAvailableMaterial() {
            return availableMaterials;
        }

        @Override
        public int addMaterial(int materialToAdd) {
            int temp = availableMaterials + materialToAdd;
            availableMaterials = Math.max(temp, 0);
            return temp;
        }
    }

    /**
     * A class for holding the PowerProducingModule's logic.
     */
    public class PowerProducing implements PowerProducingModule {
        /**
         * The power produced.
         */
        private int powerProduced;

        @Override
        public int getPowerProduced() {
            return powerProduced;
        }

        @Override
        public void setPowerProduced(int powerProduced) {
            this.powerProduced = powerProduced;
        }
    }
}
