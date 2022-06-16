package ru.netology.smartHome;

public class Sound {

    public int currentLevelOfSound;

    public int getCurrentLevelOfSound() {
        return currentLevelOfSound;
    }
    public void setCurrentLevelOfSound (int newCurrentLevelOfSound) {
        if (newCurrentLevelOfSound < 0) {
            currentLevelOfSound = 0;
            return;
        }
        if (newCurrentLevelOfSound > 10) {
            currentLevelOfSound = 10;
            return;
        }
        currentLevelOfSound = newCurrentLevelOfSound;
    }

    public void turnUpTheLevelOfSound(int currentLevelOfSound) {
        if (currentLevelOfSound <= 10) {
            currentLevelOfSound = currentLevelOfSound + 1;
            setCurrentLevelOfSound(currentLevelOfSound);
        } else {
            setCurrentLevelOfSound(currentLevelOfSound);
        }
    }

    public void turnDownTheLevelOfSound(int currentLevelOfSound) {
        if (currentLevelOfSound >= 0) {
            currentLevelOfSound = currentLevelOfSound - 1;
            setCurrentLevelOfSound(currentLevelOfSound);
        } else {
            setCurrentLevelOfSound(currentLevelOfSound);
        }
    }
    public void setToMinLevelOfSound() {
        currentLevelOfSound = 0;
    }
    public void setToMaxLevelOfSound() {
        currentLevelOfSound = 10;
    }
}
