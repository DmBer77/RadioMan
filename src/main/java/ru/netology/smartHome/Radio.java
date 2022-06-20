package ru.netology.smartHome;

public class Radio {

    public int currentRadioStation;
    public int totalNumberOfStations;
    public int lastStation;
    public int firstStation;
    public int currentLevelOfSound;
    public int minLevelOfSound = 0;
    public int maxLevelOfSound = 100;


// ____________________________________ работа с радио _______________________________________

    public Radio (int totalNumberOfStations) {
        this.firstStation = 0;
        this.lastStation = totalNumberOfStations -1;
    }

    public Radio() {
        this.totalNumberOfStations = 10;
        this.firstStation = 0;
        this.lastStation = totalNumberOfStations - 1;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < firstStation) {
            currentRadioStation = lastStation;
            return;
        }
        if (newCurrentRadioStation > lastStation) {
            currentRadioStation = firstStation;
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextStation(int currentRadioStation) {
        if (currentRadioStation <= lastStation) {
            currentRadioStation = currentRadioStation + 1;
            setCurrentRadioStation(currentRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation);
        }
    }

    public void prevStation(int currentRadioStation) {
        if (currentRadioStation >= firstStation) {
            currentRadioStation = currentRadioStation - 1;
            setCurrentRadioStation(currentRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation);
        }
    }

    public void setToFirstStation() {
        currentRadioStation = firstStation;
    }

    public void setToLastStation() {
        currentRadioStation = lastStation;
    }
// ____________________________________ работа со звуком _______________________________________

    public int getCurrentLevelOfSound() {
        return currentLevelOfSound;
    }

    public void setCurrentLevelOfSound(int newCurrentLevelOfSound) {
        if (newCurrentLevelOfSound < minLevelOfSound) {
            currentLevelOfSound = minLevelOfSound;
            return;
        }
        if (newCurrentLevelOfSound > maxLevelOfSound) {
            currentLevelOfSound = maxLevelOfSound;
            return;
        }
        currentLevelOfSound = newCurrentLevelOfSound;
    }

    public void turnUpTheLevelOfSound(int currentLevelOfSound) {
        if (currentLevelOfSound <= maxLevelOfSound) {
            currentLevelOfSound = currentLevelOfSound + 1;
            setCurrentLevelOfSound(currentLevelOfSound);
        } else {
            setCurrentLevelOfSound(currentLevelOfSound);
        }
    }

    public void turnDownTheLevelOfSound(int currentLevelOfSound) {
        if (currentLevelOfSound >= minLevelOfSound) {
            currentLevelOfSound = currentLevelOfSound - 1;
            setCurrentLevelOfSound(currentLevelOfSound);
        } else {
            setCurrentLevelOfSound(currentLevelOfSound);
        }
    }

    public void setToMinLevelOfSound() {
        currentLevelOfSound = minLevelOfSound;
    }

    public void setToMaxLevelOfSound() {
        currentLevelOfSound = maxLevelOfSound;
    }
}