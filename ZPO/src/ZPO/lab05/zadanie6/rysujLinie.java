package ZPO.lab05.zadanie6;

public class rysujLinie extends SterownikDecorator {

    public rysujLinie(SterownikDecorator action, int x, int y) {
        super(action, x, y);
    }

    public String historiaAkcji(){
        String pointInfo =  "\nNastępny punkt("+this.startX+", "+this.startY+", "+this.endX+", "+this.endY+")";
        if(action.sprawdzIlosc() == 0) {
            return action.historiaAkcji() + ", " +pointInfo +" -> brak tuszu!";
        } else if (action.sprawdzIlosc() < 30){
            return action.historiaAkcji() + ", " +pointInfo +" -> mało tuszu!";
        } else {
            return action.historiaAkcji() + ", " +pointInfo;
        }
    }

    public int calculateDistance(){
        return (int) Math.sqrt((endX-startX)*(endX-startX) + (endY-startY)*(endY-startY));
    }

    public int sprawdzIlosc(){
        int distance = calculateDistance();
        if(action.sprawdzIlosc() - distance < 0){
            return 0;
        } else {
            return action.sprawdzIlosc() - distance;
        }
    }

}
