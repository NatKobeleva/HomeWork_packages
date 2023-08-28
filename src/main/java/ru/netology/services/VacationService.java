package ru.netology.services;
public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев
                money = money - expenses;
                money = money - money / 3 * 2;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
