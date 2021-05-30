package ZPO.lab11.zadanie3;

class Authorization {
    private State failedAuthorizationState;
    private State failedThreeTimesAuthorizationState;
    private State validAuthorizationState ;
    private State checkAuthorizationState;
    private State state;

    public Authorization() {
        this.failedAuthorizationState = new FailedAuthorizationState(this);
        this.failedThreeTimesAuthorizationState = new FailedThreeTimesAuthorizationState(this);
        this.validAuthorizationState = new ValidAuthorizationState(this);
        this.checkAuthorizationState = new CheckAuthorizationState(this);
        this.state = this.checkAuthorizationState;
    }

    public void setStan(State $objStan) {
        this.state = $objStan;
    }

    public State getStan() {
        return this.state;
    }

    public void checkAuthorization(String login, String password) {
        this.state.checkAuthorization(login, password);
    }

    public State getCheckAuthorizationState() {
        return this.checkAuthorizationState;
    }

    public State getFailedAuthorizationState() {
        return this.failedAuthorizationState;
    }

    public State getFailedThreeTimesAuthorizationState() {
        return this.failedThreeTimesAuthorizationState;
    }

    public State getValidAuthorizationState() {
        return this.validAuthorizationState;
    }

}