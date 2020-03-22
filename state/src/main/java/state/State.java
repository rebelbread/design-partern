package state;

/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/3/22 15:22
 */
public interface State {

    void play();

    void doubleScore();

    void changeCards();

    void peekCards();

}
