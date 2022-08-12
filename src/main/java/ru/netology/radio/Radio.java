package ru.netology.radio;

public class Radio {
    protected int currentRadioStation;
    protected int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int CurrentRadiostation) {
        if (CurrentRadiostation < 0) {
            return;
        }
        if (CurrentRadiostation > 9) {
            return;
        }
        this.currentRadioStation = CurrentRadiostation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int CurrentVolume) {
        if (CurrentVolume < 0) {
            return;
        }
        if (CurrentVolume > 10) {
            return;
        }

        this.currentVolume = CurrentVolume;
    }


    public void getNextRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void getPrevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = 9;
        }
    }


    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}