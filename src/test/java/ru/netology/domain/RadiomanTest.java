package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldChangeTheStationByRemoteControl() {
        Radioman radio = new Radioman();
        assertEquals(8, radio.changeTheStationByRemoteControl(8));
    }

    @Test
    void shouldChangeTheStationByRemoteControlIfNumberIsWrong() {
        Radioman radio = new Radioman();
        assertEquals(5, radio.changeTheStationByRemoteControl(12));
    }

    @Test
    void shouldChangeTheStationByButtonNextIfCurrentIsNine() {
        Radioman radio = new Radioman();
        radio.setCurrentRadioStation(9);
        radio.changeTheStationByNextButton();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeTheStationByButtonNext() {
        Radioman radio = new Radioman();
        radio.changeTheStationByNextButton();
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeTheStationByPrevButtonIfCurrentIsNull() {
        Radioman radio = new Radioman();
        radio.setCurrentRadioStation(0);
        radio.changeTheStationByPrevButton();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeTheStationByPrevButton() {
        Radioman radio = new Radioman();
        radio.changeTheStationByPrevButton();
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    void shouldIncreaseVolumeUnderMinimum() {
        Radioman radio = new Radioman();
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeAboveMinimum() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(10);
        shouldDecreaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        Radioman radio = new Radioman();
        radio.decreaseVolume();
        assertEquals(4, radio.getCurrentVolume());
    }


    @Test
    void shouldDecreaseVolumeIfMin() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

}