package FootballApplication;

public class Team {
    public String teamName;
    public Player[] playerArray;

    public Team() {
    }

    public Team(String teamName, Player[] playerArray) {
        this.teamName = teamName;
        this.playerArray = playerArray;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Player[] getPlayerArray() {
        return playerArray;
    }

    public void setPlayerArray(Player[] playerArray) {
        this.playerArray = playerArray;
    }
}
