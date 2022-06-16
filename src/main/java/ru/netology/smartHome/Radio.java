package ru.netology.smartHome;

public class Radio {

    public int currentRadioStation;

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


}