package ZPO.lab02.zadanie4;

public abstract class Program {
    LanguageBehavior language;
    NotificationBehavior notification;
    double payment;

    public abstract void display();

    public abstract void sendNotification();

    public void changeLanguage(LanguageBehavior language){
        this.language = language;
    }
}
