package state;

/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/3/22 15:39
 */
public class GameAccount{
    private int score;
    private State currentState;
    private State primary = new Primary();
    private State secondary = new Secondary();
    private State professional = new Professional();
    private State sFinal = new Final();


    public GameAccount() {
        this.currentState = primary;
    }

    public void win(int score) {
        this.score += score;
        changeState();
    }

    public void lost(int score) {
        this.score -= score;
        changeState();
    }



    private void changeState() {
        if (score <= 100) {
            this.currentState = primary;
        } else if (score <= 200) {
            this.currentState = secondary;
        } else if (score <= 500) {
            this.currentState = professional;
        } else if (score <= 1000) {
            this.currentState = sFinal;
        }
    }

    public void play() {
        currentState.play();
    }

    public void doubleScore() {
        currentState.doubleScore();
    }

    public void changeCards() {
        currentState.changeCards();
    }

    public void peekCards() {
        currentState.peekCards();
    }
}
