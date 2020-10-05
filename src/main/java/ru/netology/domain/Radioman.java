package ru.netology.domain;

public class Radioman {

    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentRadioStation;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;

    public Radioman(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }
    public Radioman(){

    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }
    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void changeTheStationByNextButton() {
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = minRadioStation;
        } else {
            currentRadioStation += 1;
        }
    }

    public void changeTheStationByPrevButton() {
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = maxRadioStation;
        } else {
            currentRadioStation--;
        }
    }


    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        } else {
            currentVolume += 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        } else {
            currentVolume -= 1;

        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
            if(currentVolume > maxVolume){
                return;
            }
            if(currentVolume < minVolume){
                return;
            }
            this.currentVolume = currentVolume;
    }
}
