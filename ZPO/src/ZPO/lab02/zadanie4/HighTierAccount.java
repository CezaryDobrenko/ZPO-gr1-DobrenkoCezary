package ZPO.lab02.zadanie4;

public class HighTierAccount extends Program{
    public HighTierAccount(LanguageBehavior language, double payment){
        this.payment = payment;
        this.language = language;
        this.notification = new ViaVoiceMessage();
    }

    public void display(){
        System.out.println("I'm rich so i can afford that");
    }

    public void sendNotification(){
        this.language.translate();
        this.notification.sendMessage();
    }
}
