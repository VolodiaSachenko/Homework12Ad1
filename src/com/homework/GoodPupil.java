package com.homework;

public class GoodPupil extends Pupil {
    @Override
    void study() {
        System.out.println("Це хорошист. Оцінка: добре");
    }

    @Override
    void read() {
        System.out.println("Читання - 160 слів на хвилину");
    }

    @Override
    void write() {
        System.out.println("Твір на 150 слів, до 5-6 орфографічних помилок");
    }

    @Override
    void relax() {
        System.out.println("Відпочиває з друзями");
    }
}
