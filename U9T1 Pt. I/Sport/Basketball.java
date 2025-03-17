package Sport;

public class Basketball extends Sport {
    private int totalPlayersOnCourt;

    public Basketball(String sportName, int minPlayers, boolean ball, boolean field, int totalPlayersOnCourt) {
    super(sportName, minPlayers, ball,field);
    this.totalPlayersOnCourt = totalPlayersOnCourt;
    }


    public int getTotalPlayersOnCount() {
        return totalPlayersOnCourt;
    }


    public void playersOnCourt() {
        System.out.println("There are usually " + totalPlayersOnCourt +  " total players on the court in a game");
    }
}
