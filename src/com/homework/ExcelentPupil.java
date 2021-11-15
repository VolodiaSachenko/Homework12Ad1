package com.homework;

public class ExcelentPupil extends Pupil {
    @Override
    void study() {
        System.out.println("Це відмінник. Оцінка: відмінно");
    }

    @Override
    void read() {
        System.out.println("Читання - 200 слів на хвилину");
    }

    @Override
    void write() {
        System.out.println("Твір на 200 слів, без орфографічних помилок");
    }

    @Override
    void relax() {
        System.out.println("Відпочиває в бібліотеці");
    }
}
