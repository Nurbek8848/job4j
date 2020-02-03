package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Soltoev Nurbek");
        student.setGroup("QW-19");
        student.setDate("01.09.2019");
        System.out.println("ФИО: " + student.getFullName() + '\n' + "Группа: " + student.getGroup() + '\n' + "Дата поступения: " + student.getDate());
    }
}
