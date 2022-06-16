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
        Radio radioStat = new Radio();

        radioStat.setToLastStation();

        int expected = 9;
        int actual = radioStat.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToFirstStationIfTryToSetLastPlusOne() {
        Radio radioStat = new Radio();

        radioStat.nextStation(10);

        int expected = 0;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToLastStationIfTryToSetFirstMinusOne() {
        Radio radioStat = new Radio();

        radioStat.prevStation(-1);

        int expected = 9;
        int actual = radioStat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentStationFromTopBorder() {
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
}
