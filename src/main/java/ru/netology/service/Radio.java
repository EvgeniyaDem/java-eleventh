package ru.netology.service;

public class Radio {
    private int currentVolume;
    private int currentWave;
    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentWave() {
        return currentWave;
    }
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == 100) {
            return;
        }
    }
    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            return;
        }
    }
    public void setToMaxVolum() {
        currentVolume = 100;
    }
    public void setCurrentWave(int newCurrentWave) {
        if (newCurrentWave > 9) {
            return;
        }
        if (newCurrentWave < 0) {
            return;
        }
        currentWave = newCurrentWave;
    }
    public void increaseWave() {
        if (currentWave < 9) {
            currentWave = currentWave + 1;
        }
        if (currentWave == 9) {
            return;
        }
    }
    public void reduceWave() {
        if (currentWave > 0) {
            currentWave = currentWave - 1;
        }
        if (currentWave == 0) {
            return;
        }
    }
    public void setToMaxWave() {
        currentWave = 9;
    }
    public void setToMinWave() {
        currentWave = 0;
    }
}