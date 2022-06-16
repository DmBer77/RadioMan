package ru.netology.smartHome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SoundTest {

    @Test
    public void shouldSetLevelOfSound(){
        Sound levelOfSound = new Sound();

        levelOfSound.setCurrentLevelOfSound(6);

        int expected = 6;
        int actual = levelOfSound.getCurrentLevelOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSEtTheLowestLevelOfSound() {
        Sound levelOfSound = new Sound();

        levelOfSound.setToMinLevelOfSound();

        int expected = 0;
        int actual = levelOfSound.currentLevelOfSound;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetTheHighestLevelOfSound() {
        Sound levelOfSound = new Sound();

        levelOfSound.setToMaxLevelOfSound();

        int expected = 10;
        int actual = levelOfSound.currentLevelOfSound;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotChangeTheLevelOfSoundIfAlreadyMax() {
        Sound levelOfSound = new Sound();

        levelOfSound.turnUpTheLevelOfSound(11);

        int expected = 10;
        int actual = levelOfSound.getCurrentLevelOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotChangeTheLevelOfSoundIfAlreadyMin() {
        Sound levelOfSound = new Sound();

        levelOfSound.turnDownTheLevelOfSound(-1);

        int expected = 0;
        int actual = levelOfSound.getCurrentLevelOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnUpTheLevelOfSoundFromTopBorder() {
        Sound levelOfSound = new Sound();

        levelOfSound.turnUpTheLevelOfSound(10);

        int expected = 10;
        int actual = levelOfSound.getCurrentLevelOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnUpTheLevelOfSoundFromMiddleLevel() {
        Sound levelOfSound = new Sound();

        levelOfSound.turnUpTheLevelOfSound(5);

        int expected = 6;
        int actual = levelOfSound.getCurrentLevelOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownTheLevelOfSoundFromBottomBorder() {
        Sound levelOfSound = new Sound();

        levelOfSound.turnDownTheLevelOfSound(0);

        int expected = 0;
        int actual = levelOfSound.getCurrentLevelOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownTheLevelOfSoundFromMiddleLevel() {
        Sound levelOfSound = new Sound();

        levelOfSound.turnDownTheLevelOfSound(5);

        int expected = 4;
        int actual = levelOfSound.getCurrentLevelOfSound();

        Assertions.assertEquals(expected, actual);
    }
}
