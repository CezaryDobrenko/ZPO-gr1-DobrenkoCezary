package ZPO.lab11.zadanie2;

public class MoviePlayerTurnedOffState extends State {

    MoviePlayerTurnedOffState(MoviePlayer player) {
        super(player);
        player.setTurnedOn(false);
    }

    @Override
    public String onOffState() {
        if (moviePlayer.isTurnedOn()) {
            moviePlayer.changeState(new MoviePlayerReadyState(moviePlayer));
            return "MoviePlayer is turned off";
        } else {
            return "MoviePlayer is off...";
        }
    }

    @Override
    public String onOnState() {
        moviePlayer.changeState(new MoviePlayerReadyState(moviePlayer));
        return "Ready";
    }

    @Override
    public String onNextState() {
        return "MoviePlayer is off...";
    }

    @Override
    public String onPrevState() {
        return "MoviePlayer is off...";
    }
}