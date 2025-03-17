package Sport;
public class SportRunner { 
    public static void main(String[] args) {
        
        Sport sport = new Sport("Sport", 5, true, true);
        System.out.println(sport.getSportName());
        System.out.println(sport.getMinPlayers());
        sport.info();



        Basketball basketball = new Basketball("basketball", 1, true, false, 10);
        System.out.println(basketball.getSportName());
        System.out.println(basketball.getMinPlayers());
        System.out.println(basketball.getTotalPlayersOnCount());
        basketball.info();
        basketball.playersOnCourt();


        Baseball baseball = new Baseball("baseball", 18, true, true, 4);
        System.out.println(basketball.getSportName());
        System.out.println(basketball.getMinPlayers());
        System.out.println(baseball.getnumOfBases());
        baseball.info();
        baseball.numOfBases();
}
}