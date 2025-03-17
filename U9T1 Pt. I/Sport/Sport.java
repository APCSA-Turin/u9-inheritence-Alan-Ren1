package Sport;

public class Sport {
    private String sportName;
    private int minPlayers;
    private boolean ball;
    private boolean field;

    public Sport(String sportName, int minPlayers, boolean ball, boolean field) {
        this.sportName = sportName;
        this.minPlayers = minPlayers;
        this.ball = ball;
        this.field = field;
    }

    public String getSportName() {
        return sportName;
    }
    public int getMinPlayers() {
        return minPlayers;
    }
    
    public boolean ballNeeded() {
        return ball;
    }
    
    public boolean fieldNeeded() {
        return field;
    }

    public void info() {
        System.out.println(sportName + " is a sport where you need " + minPlayers + " player(s) to play. A ball needed to play: " + ball + " A field needed to play: " + field);
    }
}
