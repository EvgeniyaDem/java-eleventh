package ru.netology.service;

public class Radio {
    public int currentVolume;
    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int newCurrentVolum) {
        if (newCurrentVolum > 100) {
            return;
        }
        if (newCurrentVolum < 0) {
            return;
        }
        currentVolume = newCurrentVolum;
    }
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }
    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
    public void setToMaxVolum() {
        currentVolume = 100;
    }



    public int currentWave;
    public int getCurrentWave() {
        return currentWave;
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
    }
    public void reduceWave() {
        if (currentWave > 0) {
            currentWave = currentWave - 1;
        }
    }
    public void setToMaxWave() {
        currentWave = 9;
    }
}