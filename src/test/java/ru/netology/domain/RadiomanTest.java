package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanTest {
    Radioman radio = new Radioman(12);

    @Test
    void shouldChangeTheStationByRemoteControl() {
        radio.setCurrentRadioStation(8);
        assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeTheStationByRemoteControlIfNumberIsWrong() {
        radio.setCurrentRadioStation(12);
        radio.changeTheStationByNextButton();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeTheStationByButtonNextIfCurrentIsNine() {
        radio.setCurrentRadioStation(9);
        radio.changeTheStationByNextButton();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeTheStationByButtonNext() {
        radio.setCurrentRadioStation(5);
        radio.changeTheStationByNextButton();
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeTheStationByPrevButtonIfCurrentIsNull() {
        radio.setCurrentRadioStation(0);
        radio.changeTheStationByPrevButton();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeTheStationByPrevButton() {
        radio.setCurrentRadioStation(5);
        radio.changeTheStationByPrevButton();
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    void shouldIncreaseVolumeUnderMinimum() {
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeAboveMinimum() {
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        assertEquals(4, radio.getCurrentVolume());
    }


    @Test
    void shouldDecreaseVolumeIfMin() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

}