package ZPO.lab11.zadanie2;

public class MoviePlayerTurnedOnState extends State {

    MoviePlayerTurnedOnState(MoviePlayer player) {
        super(player);
    }

    @Override
    public String onOffState() {
        moviePlayer.changeState(new MoviePlayerTurnedOffState(moviePlayer));
        moviePlayer.setCurrentTrackAfterStop();
        return "MoviePlayer is turned off";
    }

    @Override
    public String onOnState() {
        moviePlayer.changeState(new MoviePlayerReadyState(moviePlayer));
        return "Paused...";
    }

    @Override
    public String onNextState() {
        return moviePlayer.nextTrack();
    }

    @Override
    public String onPrevState() {
        return moviePlayer.previousTrack();
    }
}