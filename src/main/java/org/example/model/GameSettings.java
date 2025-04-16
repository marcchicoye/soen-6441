package org.example.model;

public class GameSettings {
    int neutralArmies;
    boolean isOneArmyMustStandGuard;


    public GameSettings(int neutralArmies, boolean isOneArmyMustStandGuard) {
        this.neutralArmies = neutralArmies;
        this.isOneArmyMustStandGuard = isOneArmyMustStandGuard;
    }

    public int getNeutralArmies() {
        return neutralArmies;
    }

    public boolean isOneArmyMustStandGuard() {
        return isOneArmyMustStandGuard;
    }

}
