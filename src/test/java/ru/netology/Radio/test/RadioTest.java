package ru.netology.Radio.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.Radio.Radio;

public class RadioTest {
    @Test
    public void shouldCreateRadioWithDefaultNumberOfStations() {
        Radio radio = new Radio();
        Assertions.assertEquals(10, radio.getNumberOfStations());
    }
    @Test
    public void shouldCreateRadioWithCustomNumberOfStations() {
        Radio radio = new Radio(20);
        Assertions.assertEquals(20, radio.getNumberOfStations());
    }
    @Test
    public void shouldNotCreateRadioWithCustomStation() {
        Radio radio = new Radio(-5);
        Assertions.assertEquals(10, radio.getNumberOfStations());
    }
    @Test
    public void shouldSwitchToNextStation() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(18);
        radio.nextStation();
        Assertions.assertEquals(19, radio.getCurrentStation());
    }
    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        Assertions.assertEquals(radio.getCurrentStation(), 5);
    }

    @Test
    public void shouldNotSetCurrentStationIfInvalid() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(25);
        Assertions.assertEquals(radio.getCurrentStation(), 0);
    }

    @Test
    public void shouldSwitchToZeroStationAfterMax() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(19);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchToPreviousStation() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(5);
        radio.prevStation();
        Assertions.assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchToMaxStationAfterZero() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(0);
        radio.prevStation();
        Assertions.assertEquals(19, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        Assertions.assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.decreaseVolume();
        Assertions.assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotIncreaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotDecreaseVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeToMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeToMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        Assertions.assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        Assertions.assertEquals(50, radio.getCurrentVolume());
    }
    @Test
   public void shouldNotSetCurrentStationIfLessThanZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void shouldNotSetCurrentStationIfGreaterThanNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }
}
