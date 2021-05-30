package ZPO.lab11.zadanie3;

public class CheckAuthorizationState implements State {
    Authorization authorization;
    String login = "login";
    String password = "password";
    int countTry = 0;

    public CheckAuthorizationState(Authorization authorization){
        this.authorization = authorization;
    }

    public void checkAuthorization(String login, String password) {
        if(login == this.login && password == this.password){
            authorization.setStan(authorization.getValidAuthorizationState());
            countTry = 0;
        } else if ((login == this.login || password == this.password) && countTry < 2){
            authorization.setStan(authorization.getFailedAuthorizationState());
            countTry++;
        } else {
            authorization.setStan(authorization.getFailedThreeTimesAuthorizationState());
        }
    }
}
