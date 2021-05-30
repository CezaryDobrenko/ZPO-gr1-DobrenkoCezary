package ZPO.lab11.zadanie2;

public class MoviePlayerReadyState extends State {

    public MoviePlayerReadyState(MoviePlayer player) {
        super(player);
    }

    @Override
    public String onOffState() {
        moviePlayer.changeState(new MoviePlayerTurnedOffState(moviePlayer));
        return "MoviePlayer is off...";
    }

    @Override
    public String onOnState() {
        String action = moviePlayer.startPlayback();
        moviePlayer.changeState(new MoviePlayerTurnedOnState(moviePlayer));
        return action;
    }

    @Override
    public String onNextState() {
        return "Locked...";
    }

    @Override
    public String onPrevState() {
        return "Locked...";
    }
}