package org.example;

import java.util.List;

// Реализация стратегии подсчета статистики по полу
public class GenderStatisticsStrategy implements StatisticsStrategy {
    @Override
    public void calculateStatistics(List<Player> players) {
        int totalPlayers = players.size();
        int maleCount = 0;
        int femaleCount = 0;
        int totalAge = 0;

        for (Player player : players) {
            // Подсчет количества игроков по полу
            if (player.getGender().equals("Male")) {
                maleCount++;
            } else if (player.getGender().equals("Female")) {
                femaleCount++;
            }

            // Вычисление суммарного возраста
            totalAge += player.getAge();
        }

        // Вывод статистики по полу
        System.out.println("Total players: " + totalPlayers);
        System.out.println("Male count: " + maleCount);
        System.out.println("Female count: " + femaleCount);
        System.out.println("Average age: " + (totalAge / (int) totalPlayers));
    }

    @Override
    public void executeStrategy(StatisticsStrategy strategy, List<Player> players) {
        if (strategy != null) {
            strategy.calculateStatistics(players);
        } else {
            System.out.println("Invalid statistics type");
        }
    }
}