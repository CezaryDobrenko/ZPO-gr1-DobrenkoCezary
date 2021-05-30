package ZPO.lab11.zadanie2;

import java.util.ArrayList;
import java.util.List;

public class MoviePlayer {
    private State state;
    private boolean isTurnedOn = false;
    private List<String> channels = new ArrayList<>();
    private int currentChannel = 0;

    public MoviePlayer() {
        this.state = new MoviePlayerReadyState(this);
        setTurnedOn(true);
        setChannels();
    }

    public String nextTrack() {
        currentChannel++;
        if (currentChannel > channels.size() - 1) {
            currentChannel = 0;
        }
        return "Current channel is:  " + channels.get(currentChannel);
    }

    public String previousTrack() {
        currentChannel--;
        if (currentChannel < 0) {
            currentChannel = channels.size() - 1;
        }
        return "Current channel is: " + channels.get(currentChannel);
    }

    public void setChannels(){
        for (int i = 1; i < 5; i++)
            channels.add("Channel " + i);
    }

    public void setTurnedOn(boolean turnedOn) {
        this.isTurnedOn = turnedOn;
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public String startPlayback() {
        return "Playing " + channels.get(currentChannel);
    }

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setCurrentTrackAfterStop() {
        this.currentChannel = 0;
    }
}