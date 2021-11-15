package com.homework;

import java.util.Scanner;

/**
 * @author Volodia Sachenko
 * @version 0.1
 * @since 14.11.21
 */

public class ClassRoom {

    public ClassRoom(Pupil pupil, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        saveInfo(pupil);
        saveInfo(pupil2);
        saveInfo(pupil3);
        saveInfo(pupil4);
    }

    private static String scanning() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void saveInfo(Pupil object) {
        System.out.println("Введіть ім'я учня:");
        object.setName(scanning());
        System.out.println("Введіть прізвище учня:");
        object.setFullName(scanning());
        System.out.println("По батькові:");
        object.setFathersName(scanning());
        System.out.println("----------------");
    }

    private void showInfo(Pupil pupil) {
        System.out.println((char) 27 + "[34m" + "Прізвище: " + pupil.getFullName());
        System.out.println((char) 27 + "[34m" + "Ім'я: " + pupil.getName());
        System.out.println((char) 27 + "[34m" + "По батькові: " + pupil.getFathersName());
        pupil.study();
        pupil.read();
        pupil.write();
        pupil.relax();
        System.out.println("----------------");
    }

    public static void main(String[] args) {
        System.out.println("Вас вітає програма \"Клас\" \uD83D\uDCD6");
        System.out.println("Заповніть інформацію про чотирьох учнів.");
        Pupil pupil = new Pupil();
        ExcelentPupil pupil2 = new ExcelentPupil();
        GoodPupil pupil3 = new GoodPupil();
        BadPupil pupil4 = new BadPupil();
        ClassRoom classRoom = new ClassRoom(pupil, pupil2, pupil3, pupil4);
        classRoom.showInfo(pupil);
        classRoom.showInfo(pupil2);
        classRoom.showInfo(pupil3);
        classRoom.showInfo(pupil4);
    }
}
