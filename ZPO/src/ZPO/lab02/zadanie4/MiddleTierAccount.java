package ZPO.lab02.zadanie4;

public class MiddleTierAccount extends Program{
    public MiddleTierAccount(LanguageBehavior language, double payment){
        this.payment = payment;
        this.language = language;
        this.notification = new ViaSMS();
    }

    public void display(){
        System.out.println("I'm normal so i get middle tier service");
    }

    public void sendNotification(){
        this.language.translate();
        this.notification.sendMessage();
    }
}
