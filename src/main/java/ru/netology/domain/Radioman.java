package ru.netology.domain;

public class Radioman {

    private int currentVolume = 5;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentRadioStation = 5;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;


    public int changeTheStationByRemoteControl(int intendedStation) {
        if (intendedStation <= 9 && intendedStation >= 0) {
            currentRadioStation = intendedStation;
        }
        return currentRadioStation;
    }


    public void changeTheStationByNextButton() {
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = 0;
        } else {
            currentRadioStation += 1;
        }
    }

    public void changeTheStationByPrevButton() {
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = 9;
        } else {
            currentRadioStation -= 1;
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

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
            if(currentRadioStation > maxRadioStation){
                return;
            }
            if(currentRadioStation < minRadioStation){
                return;
            }
            this.currentRadioStation = currentRadioStation;
    }
}
