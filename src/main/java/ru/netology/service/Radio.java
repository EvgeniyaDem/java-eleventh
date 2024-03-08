package ru.netology.service;

public class Radio {
    private int currentVolume;
    private int currentWave;
    private int limitWave;

    public Radio() {
        this.limitWave = 10;
    }

    public Radio(int limitWave) {
        this.limitWave = limitWave;
    }

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
        if (newCurrentWave > limitWave - 1) {
            return;
        }
        if (newCurrentWave < 0) {
            return;
        }
        currentWave = newCurrentWave;
    }
    public void increaseWave() {
        if (currentWave < limitWave - 1) {
            currentWave = currentWave + 1;
        }
        if (currentWave == limitWave - 1) {
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
        currentWave = limitWave - 1;
    }
    public void setToMinWave() {
        currentWave = 0;
    }
}























