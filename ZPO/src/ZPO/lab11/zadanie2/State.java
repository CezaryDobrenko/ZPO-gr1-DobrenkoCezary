package ZPO.lab11.zadanie2;

public abstract class State {
    MoviePlayer moviePlayer;

    State(MoviePlayer moviePlayer) {
        this.moviePlayer = moviePlayer;
    }

    public abstract String onOffState();
    public abstract String onOnState();
    public abstract String onNextState();
    public abstract String onPrevState();
}