package Sport;

public class Baseball extends Sport{
    private int numOfBases;

    public Baseball(String sportName, int minPlayers, boolean ball, boolean field, int numOfBases) {
        super(sportName, minPlayers, ball, field);
        this.numOfBases = numOfBases;
    }

    public int getnumOfBases() {
        return numOfBases;
    }

    public void numOfBases() {
        System.out.println("There are usually " + numOfBases + " bases in a field");
    }
}
