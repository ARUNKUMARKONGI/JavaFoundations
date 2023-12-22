package _1nextsession;

import java.util.ArrayList;
import java.util.List;
class CricketPlayer {
    private String name;
    private int runs;
    private int centuries;

    public CricketPlayer(String name, int runs, int centuries) {
        this.name = name;
        this.runs = runs;
        this.centuries = centuries;
    }

    public String getName() {
        return name;
    }
    public int getRuns() {
        return runs;
    }
    public int getCenturies() {
        return centuries;
    }

    @Override
    public String toString() {
        return "CricketPlayer{" +
                "name='" + name + '\'' +
                ", runs=" + runs +
                ", centuries=" + centuries +
                '}';
    }
}

class lambdamcq {
    public static void main(String[] args) {
        List<CricketPlayer> players = new ArrayList<>();
        players.add(new CricketPlayer("Virat Kohli", 12000, 70));
        players.add(new CricketPlayer("Rohit Sharma", 9000, 29));
        players.add(new CricketPlayer("Steve Smith", 8500, 27));
        players.add(new CricketPlayer("Kane Williamson", 8000, 23));
        players.add(new CricketPlayer("Joe Root", 8500, 20));
        /*for (int i = 0; i < 5; i++) {
            System.out.print("Enter player name: ");
            String name = scanner.next();
            System.out.print("Enter runs: ");
            int runs = scanner.nextInt();
            System.out.print("Enter centuries: ");
            int centuries = scanner.nextInt();

            players.add(new CricketPlayer(name, runs, centuries));
        }*/

        for (CricketPlayer i : players) {
            System.out.println(i.getName() + " - Centuries: " + i.getCenturies());
        }

        for (CricketPlayer player : players) {
            if (player.getCenturies() > 0) {
                System.out.println(player);
            }
        }
        // Using Lambda Expression to filter players with more than 8000 runs
        players.stream().filter(player -> player.getRuns() > 8000).forEach(System.out::println);
       // players.stream().filter(player -> player.getCenturies() > 0).forEach(System.out::println);
    }
}
