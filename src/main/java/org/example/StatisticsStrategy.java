package org.example;

import java.util.List;

// Интерфейс для стратегии подсчета статистики
public interface StatisticsStrategy {
    void calculateStatistics(List<Player> players);
    void executeStrategy(StatisticsStrategy strategy, List<Player> players);
}