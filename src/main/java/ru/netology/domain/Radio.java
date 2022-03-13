package ru.netology.domain;

public class Radio {

    String name;
    boolean on;
    private int currentRadioStation;
    private int maxRadioStation;
    private int minRadioStation;
    private int currentVolume;
    private int minCurrentVolume;
    private int maxCurrentVolume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            this.currentRadioStation = minRadioStation;
            return;
        }
        if (currentRadioStation < minRadioStation) {
            this.currentRadioStation = maxRadioStation;
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }


    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {

        if (currentVolume > maxCurrentVolume) {
            return;
        }
        if (currentVolume < minCurrentVolume) {
            return;
        }
        this.currentVolume = currentVolume + 1;
    }

    public int getMinCurrentVolume() {
        return minCurrentVolume;
    }

    public void setMinCurrentVolume(int minCurrentVolume) {
        this.minCurrentVolume = minCurrentVolume;

    }

    public int getMaxCurrentVolume() {
        return maxCurrentVolume;
    }

    public void setMaxCurrentVolume(int maxCurrentVolume) {
        this.maxCurrentVolume = maxCurrentVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
