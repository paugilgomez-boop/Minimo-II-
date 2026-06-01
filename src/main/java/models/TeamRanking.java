package models;

public class TeamRanking {

    private String name;
    private String avatar;
    private int points;

    public TeamRanking() {
    }

    public TeamRanking(String name, String avatar, int points) {
        this.name = name;
        this.avatar = avatar;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public String getAvatar() {
        return avatar;
    }

    public int getPoints() {
        return points;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}