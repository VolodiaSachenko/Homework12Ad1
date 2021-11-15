package com.homework;

public class BadPupil extends Pupil {
    @Override
    void study() {
        System.out.println("Це поганий учень. Оцінка: незадовільно");
    }

    @Override
    void read() {
        System.out.println("Читає 10 слів на годину");
    }

    @Override
    void write() {
        System.out.println("Пише тільки на заборі");
    }

    @Override
    void relax() {
        System.out.println("П'є пиво");
    }
}
