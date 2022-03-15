package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    private final Radio radio = new Radio();

    @Test
    public void setIncreaseVolume() {
        radio.setMaxCurrentVolume(10);
        radio.setMinCurrentVolume(0);
        radio.setCurrentVolume(9);
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    public void oneVolume() {
        radio.setMaxCurrentVolume(10);
        radio.setMinCurrentVolume(0);
        radio.setCurrentVolume(12);
        assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void twoVolume() {
        radio.setMaxCurrentVolume(10);
        radio.setMinCurrentVolume(0);
        radio.setCurrentVolume(-4);
        assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void threeVolume() {
        radio.setMaxCurrentVolume(10);
        radio.setMinCurrentVolume(0);
        radio.setCurrentVolume(1);
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void fourVolume() {
        radio.setMaxCurrentVolume(10);
        radio.setMinCurrentVolume(0);
        radio.setCurrentVolume(10);
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    public void setIncreaseRadioStation() {
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(15);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void setDecreaseRadioStation() {
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(-15);
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void oneRadioStation() {
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(3);
        assertEquals(3, radio.getCurrentRadioStation());
    }

    @Test
    public void twoRadioStation() {
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(1);
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void threeRadioStation() {
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(6);
        assertEquals(6, radio.getCurrentRadioStation());
    }

}
