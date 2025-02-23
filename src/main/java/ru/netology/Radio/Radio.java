package ru.netology.Radio;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int numberOfStations;

    public Radio() {
        this.numberOfStations = 10;
        this.currentStation = 0;
        this.currentVolume = 50;
    }
    public Radio(int numberOfStations) {
        if (numberOfStations > 0) {
            this.numberOfStations = numberOfStations;
        }else {
            this.numberOfStations = 10;
        }
        this.currentStation = 0;
        this.currentVolume = 50;
    }

    public void nextStation() {
        if (currentStation == numberOfStations - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = numberOfStations - 1;
        } else {
            currentStation--;
        }
    }

    public void setCurrentStation(int station) {
        if (station >= 0 && station <numberOfStations) {
            currentStation = station;
        }
    }

    public void setCurrentVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            currentVolume = volume;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
    public int getNumberOfStations() {
        return numberOfStations;
    }

}