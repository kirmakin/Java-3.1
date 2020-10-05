package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanTest {
    Radioman radio = new Radioman(5,100, 0, 5, 15, 0);

    @Test
    void shouldChangeTheStationByButtonNextIfCurrentIsMax() {
        radio.setCurrentRadioStation(15);
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
        assertEquals(15, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeTheStationByPrevButton() {
        radio.setCurrentRadioStation(5);
        radio.changeTheStationByPrevButton();
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    void shouldIncreaseVolumeUnderMinimum() {
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeAboveMinimum() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        radio.setCurrentVolume(50);
        radio.decreaseVolume();
        assertEquals(49, radio.getCurrentVolume());
    }


    @Test
    void shouldDecreaseVolumeIfMin() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

}