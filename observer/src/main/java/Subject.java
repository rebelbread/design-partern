import java.util.ArrayList;
import java.util.List;

/**
 *
 * @Description:
 * @author zhiwj
 * @date 2020/3/21 17:29
 */
public abstract class Subject {

    protected List<Observer> list = new ArrayList<Observer>();

    public void register(Observer observer) {
        list.add(observer);
    }

    public void unsubscribe(Observer observer) {
        list.remove(observer);
    }

    public abstract void notice(Object msg);

}
