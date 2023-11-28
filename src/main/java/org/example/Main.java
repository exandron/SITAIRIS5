package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {

            PlayerFactory playerFactory = new ConcretePlayerFactory();
            PlayerXmlReader playerXmlReader = new PlayerXmlReader(playerFactory);

            // Чтение игроков из XML файла
            List<Player> players = playerXmlReader.readPlayers("players.xml");

            StatisticsStrategy strategy = new GenderStatisticsStrategy();
            strategy.executeStrategy(strategy, players);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}