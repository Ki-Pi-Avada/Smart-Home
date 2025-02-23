package org.example;

import ru.netology.Radio.Radio;

public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();

        // Демонстрация работы с радиостанциями
        System.out.println("Текущая станция:" + radio.getCurrentStation()); // 0
        radio.nextStation();
        System.out.println("Следующая станция:" + radio.getCurrentStation()); // 1
        radio.setCurrentStation(9);
        System.out.println("Установлена станция: " + radio.getCurrentStation()); // 9
        radio.nextStation();
        System.out.println("Следующая станция после 9: " + radio.getCurrentStation()); // 0
        radio.prevStation();
        System.out.println("Предыдущая станция после 0: " + radio.getCurrentStation()); // 9

        // Демонстрация работы с громкостью
        System.out.println("Текущая громкость: " + radio.getCurrentVolume()); // 50
        radio.increaseVolume();
        System.out.println("Громкость после увеличения: " + radio.getCurrentVolume()); // 51
        radio.setCurrentVolume(100);
        System.out.println("Установлена максимальная громкость: " + radio.getCurrentVolume()); // 100
        radio.increaseVolume();
        System.out.println("Попытка увеличить громкость выше 100: " + radio.getCurrentVolume()); // 100
        radio.decreaseVolume();
        System.out.println("Громкость после уменьшения: " + radio.getCurrentVolume()); // 99
    }
}