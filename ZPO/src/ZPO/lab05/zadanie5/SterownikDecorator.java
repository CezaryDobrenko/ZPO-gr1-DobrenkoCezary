package ZPO.lab05.zadanie5;

public abstract class SterownikDecorator implements IPloter {
    protected IPloter action;

    int startX;
    int startY;
    int endX;
    int endY;
    int zasobnikTuszu;

    public SterownikDecorator(IPloter newAction, int x, int y){
        this.action = newAction;
        rysujDo(x,y);
    }

    public void ustalPozycje(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    public void rysujDo(int x, int y) {
        this.endX = x;
        this.endY = y;
    }

    public String historiaAkcji(){
        return action.historiaAkcji();
    }

    public double getTusz(){
        return action.getTusz();
    }

}
