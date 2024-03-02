package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetVolum() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        int expected = 50;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetVolumAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(110);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int expected = 11;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldReduceVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(80);
        radio.reduceVolume();

        int expected = 79;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToMaxVolum() {
        Radio radio = new Radio();
        radio.setToMaxVolum();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void shouldSetWave() {
        Radio radio = new Radio();
        radio.setCurrentWave(7);

        int expected = 7;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetWaveAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentWave(15);

        int expected = 0;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseWave() {
        Radio radio = new Radio();
        radio.setCurrentWave(3);
        radio.increaseWave();

        int expected = 4;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldReduceWave() {
        Radio radio = new Radio();
        radio.setCurrentWave(6);
        radio.reduceWave();

        int expected = 5;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToMaxWave() {
        Radio radio = new Radio();
        radio.setToMaxWave();

        int expected = 9;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }
}
