package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(5);

        int expected = 5;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextMaxRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(9);

        station.getNextRadioStation();


        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextMinRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(0);

        station.getNextRadioStation();

        int expected = 1;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(-5);

        station.getNextRadioStation();

        int expected = 1;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNoValidRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(15);

        station.getNextRadioStation();

        int expected = 1;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetPrevMinRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(0);

        station.getPrevRadioStation();

        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNoValidRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(15);

        station.getPrevRadioStation();

        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetPrevRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(-4);

        station.getPrevRadioStation();

        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {

        Radio volume = new Radio();

        volume.setCurrentVolume(7);

        int expected = 7;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMaxVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(10);

        volume.increaseVolume();

        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(0);

        volume.increaseVolume();

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolumeOverMax() {
        Radio volume = new Radio();

        volume.setCurrentVolume(15);

        volume.increaseVolume();

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeUnderMin() {
        Radio volume = new Radio();

        volume.setCurrentVolume(0);

        volume.reduceVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceMaxVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(10);

        volume.reduceVolume();

        int expected = 9;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceMinVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(7);

        volume.reduceVolume();

        int expected = 6;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNoValidNegVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(-5);

        volume.reduceVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceNoValidVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(15);

        volume.reduceVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}