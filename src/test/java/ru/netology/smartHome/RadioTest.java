package ru.netology.smartHome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio radioStat = new Radio();

        radioStat.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetFirstStation() {
        Radio radioStat = new Radio();

        radioStat.setToFirstStation();

        int expected = 0;
        int actual = radioStat.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLastStation() {
        Radio radioStat = new Radio(25);

        radioStat.setToLastStation();

        int expected = 24;
        int actual = radioStat.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToFirstStationIfTryToSetLastPlusOne() {
        Radio radioStat = new Radio(30);

        radioStat.nextStation(30);

        int expected = 0;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToFirstStationIfTryToSetLastPlusOneByDefault() {
        Radio radioStat = new Radio();

        radioStat.nextStation(10);

        int expected = 0;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToLastStationIfTryToSetFirstMinusOne() {
        Radio radioStat = new Radio(30);

        radioStat.prevStation(-1);

        int expected = 29;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToLastStationIfTryToSetFirstMinusOneByDefault() {
        Radio radioStat = new Radio();

        radioStat.prevStation(-1);

        int expected = 9;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentStationFromTopBorder() {
        Radio radioStat = new Radio(30);

        radioStat.nextStation(29);

        int expected = 0;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentStationFromTopBorderByDefault() {
        Radio radioStat = new Radio();

        radioStat.nextStation(9);

        int expected = 0;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentStationFromMiddleLevel() {
        Radio radioStat = new Radio();

        radioStat.nextStation(5);

        int expected = 6;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentStationFromBottomBorder() {
        Radio radioStat = new Radio(30);

        radioStat.prevStation(0);

        int expected = 29;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentStationFromBottomBorderByDefault() {
        Radio radioStat = new Radio();

        radioStat.prevStation(0);

        int expected = 9;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseCurrentStationFromMiddleLevel() {
        Radio radioStat = new Radio();

        radioStat.prevStation(5);

        int expected = 4;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetLevelOfSound(){
        Radio levelOfSound = new Radio();

        levelOfSound.setCurrentLevelOfSound(6);

        int expected = 6;
        int actual = levelOfSound.getCurrentLevelOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSEtTheLowestLevelOfSound() {
        Radio levelOfSound = new Radio();

        levelOfSound.setToMinLevelOfSound();

        int expected = 0;
        int actual = levelOfSound.currentLevelOfSound;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetTheHighestLevelOfSound() {
        Radio levelOfSound = new Radio();

        levelOfSound.setToMaxLevelOfSound();

        int expected = 100;
        int actual = levelOfSound.currentLevelOfSound;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotChangeTheLevelOfSoundIfAlreadyMax() {
        Radio levelOfSound = new Radio();

        levelOfSound.turnUpTheLevelOfSound(100);

        int expected = 100;
        int actual = levelOfSound.getCurrentLevelOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotChangeTheLevelOfSoundIfAlreadyMin() {
        Radio levelOfSound = new Radio();

        levelOfSound.turnDownTheLevelOfSound(-1);

        int expected = 0;
        int actual = levelOfSound.getCurrentLevelOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnUpTheLevelOfSoundFromTopBorder() {
        Radio levelOfSound = new Radio();

        levelOfSound.turnUpTheLevelOfSound(101);

        int expected = 100;
        int actual = levelOfSound.getCurrentLevelOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnUpTheLevelOfSoundFromMiddleLevel() {
        Radio levelOfSound = new Radio();

        levelOfSound.turnUpTheLevelOfSound(50);

        int expected = 51;
        int actual = levelOfSound.getCurrentLevelOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownTheLevelOfSoundFromBottomBorder() {
        Radio levelOfSound = new Radio();

        levelOfSound.turnDownTheLevelOfSound(0);

        int expected = 0;
        int actual = levelOfSound.getCurrentLevelOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownTheLevelOfSoundFromMiddleLevel() {
        Radio levelOfSound = new Radio();

        levelOfSound.turnDownTheLevelOfSound(45);

        int expected = 44;
        int actual = levelOfSound.getCurrentLevelOfSound();

        Assertions.assertEquals(expected, actual);
    }
}
