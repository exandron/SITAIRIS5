package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Реализация стратегии подсчета статистики по виду спорта
public class SportStatisticsStrategy implements StatisticsStrategy {
    @Override
    public void calculateStatistics(List<Player> players) {
        int totalPlayers = players.size();
        int totalAge = 0;

        // Подсчет количества игроков для каждого вида спорта
        Map<String, Integer> sportCounts = new HashMap<>();
        for (Player player : players) {
            String sport = player.getSport();
            int sportCount = sportCounts.getOrDefault(sport, 0) + 1;
            sportCounts.put(sport, sportCount);

            // Вычисление суммарного возраста
            totalAge += player.getAge();
        }

        // Поиск наиболее популярного вида спорта
        String mostPopularSport = null;
        int maxSportCount = 0;
        for (Map.Entry<String, Integer> entry : sportCounts.entrySet()) {
            String sport = entry.getKey();
            int sportCount = entry.getValue();
            if (sportCount > maxSportCount) {
                maxSportCount = sportCount;
                mostPopularSport = sport;
            }
        }

        // Вывод статистики по виду спорта
        System.out.println("Total players: " + totalPlayers);
        System.out.println("Most popular sport: " + mostPopularSport);
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