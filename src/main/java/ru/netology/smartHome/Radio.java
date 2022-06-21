package ru.netology.smartHome;

public class Radio {

    private int currentRadioStation;
    private int currentLevelOfSound;


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            currentRadioStation = 9;
            return;
        }
        if (newCurrentRadioStation > 9) {
            currentRadioStation = 0;
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int getCurrentLevelOfSound() {
        return currentLevelOfSound;
    }

    public void setCurrentLevelOfSound(int newCurrentLevelOfSound) {
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

    public void nextStation(int currentRadioStation) {
        if (currentRadioStation <= 9) {
            currentRadioStation = currentRadioStation + 1;
            setCurrentRadioStation(currentRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation);
        }
    }

    public void prevStation(int currentRadioStation) {
        if (currentRadioStation >= 0) {
            currentRadioStation = currentRadioStation - 1;
            setCurrentRadioStation(currentRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation);
        }
    }

    public void setToFirstStation() {
        currentRadioStation = 0;
    }

    public void setToLastStation() {
        currentRadioStation = 9;
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