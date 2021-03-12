package ZPO.lab02.zadanie4;

public class LowTierAccount extends Program{
    public LowTierAccount(LanguageBehavior language, double payment){
        this.payment = payment;
        this.language = language;
        this.notification = new ViaEmail();
    }

    public void display(){
        System.out.println("I'm poor :(");
    }

    public void sendNotification(){
        this.language.translate();
        this.notification.sendMessage();
    }
}
