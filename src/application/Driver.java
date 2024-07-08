package application;

public class Driver {
    private String name;
    private int wins;
    private int points;
    private int rank;

    public Driver(String name, int wins, int points, int rank) {
        this.name = name;
        this.wins = wins;
        this.points = points;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    public int getPoints() {
        return points;
    }

    public int getRank() {
        return rank;
    }
}
